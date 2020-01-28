/* IMPORTANT: Multiple classes and nested static classes are supported */

// import java.io.*;

// class EqualSubArray {
//     static int arr[];
//     public static void main(String args[] ) throws Exception {
        
//         BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
//         int size = Integer.parseInt(s.readLine());
//         System.out.println("size :"+size);
//         int k = Integer.parseInt(s.readLine());
//         System.out.println("k :"+k);
//          arr = new int[size];
//         String sarr[] = s.readLine().split("\\s");
//         int maxlength = 0;
//         for(int i=0;i<size;i++){
//                 arr[i] = Integer.parseInt(sarr[i]);
//         }
//         boolean b =false;
//         int max = 0;
//         for(int i=size-1;i>1 ;i--){ //sub arr from 2 to n-1
                
//             for(int j=0;j<size;j++){
//                     if(j+i > size)
//                         break;
//                      max = getMax(j,(j+i));
//                      b = isEqualArray(j,(j+i),max,k);
//                     if(b){
//                         maxlength = i;
//                         break;
//                     }
//             }
//             if(b)
//                 break;
//         }
//         System.out.println(maxlength);
//         s.close();
//     }
//         static int getMax(int s,int e){
//             int max=s;
//             int i=s;
//             while(i !=e){
//                 if(arr[max] < arr[i])
//                     max =i;
                
//                  i =( i+1);
//             }
//             return max;
//         }
//         static boolean isEqualArray(int s,int e,int max,int k){
//             int totalAdd=0;
//             int i=s;
//             while(i != e){
//                 totalAdd = totalAdd + arr[max]-arr[i];
//                 if(totalAdd > k)
//                     return false;
//                 i = (i+1);
//             }
//             if(totalAdd <= k)
//                 return true;
//             return false;
//         }
        


// }

import java.lang.Math;
import java.util.*;

class EqualSubArray{

    int segmentTree[],arr[];

    EqualSubArray(int arr[]){
        this.arr = arr;
        int x = (int) (Math.ceil(Math.log(arr.length) / Math.log(2))); 
        System.out.println("building--------------");
        //Maximum size of segment tree 
        int max_size = 2 * (int) Math.pow(2, x) - 1; 
        segmentTree = new int[max_size];
        constructSt(0,arr.length-1,0);
    }

    int constructSt(int start,int end , int i){
        if(start == end){
            segmentTree[i] = arr[start];
            return arr[start];
        }
        int mid = (start+end)/2;
        return segmentTree[i] = Math.max(constructSt(start, mid, (2*i)+1),constructSt(mid+1, end, (2*i)+2));
    }

    int getMax(int ss,int se,int qs,int qe,int si){
        // the sum of the segment 
        if (qs <= ss && qe >= se) 
            return segmentTree[si]; 
  
        // If segment of this node is outside the given range 
        if (se < qs || ss > qe) 
            return 0; 
  
        // If a part of this segment overlaps with the given range 
        int mid = (ss+se)/2; 
        return Math.max(getMax(ss,mid,qs,qe,2*si+1),getMax(mid+1,se,qs,qe,si*2+2));
    }

    void print(){
        System.out.println();
        for(int i=0;i<segmentTree.length;i++){
            System.out.print(" "+segmentTree[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int k = scan.nextInt();
            int arr[] = new int[n];
            int pref[] = new int[n+1];
                pref[0] = 0;
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();
              
                pref[i+1]=pref[i ]+arr[i];
               
            }
            pref[n] = pref[n-1]+arr[n-1];

            EqualSubArray st = new EqualSubArray(arr);
            int ans =1;
            for(int i=0;i<n;i++){
                int start=i,end = n-1,mid,max_index=i;
                while(start<=end){
                    mid = (start+end)/2;
                    int maxElement = st.getMax(0, n-1, i, mid, 0);
                    int expacted_sum = (mid-i+1)*maxElement;
                    int actual_sum = pref[mid+1]-pref[i];
                    if(expacted_sum - actual_sum <= k){
                        start = mid+1;
                        max_index = Math.max(max_index, mid);
                    }else{
                        end = mid -1;
                    }
                }
                ans = Math.max(ans,max_index-i+1);
            }
            System.out.println(ans);
          

                    //  1 4 9 3 6
    }

}