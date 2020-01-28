import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math;
import java.math.BigInteger;

class GoodSubSequence {
    public static void main(String args[] ) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int N = Integer.parseInt(br.readLine());                // Reading input from STDIN
         int arr[] = new int[N];
         String temp[] = new String[N];
        temp = br.readLine().split("\\s");
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(temp[i]);
        }
        
        System.out.println("count:  "+getCount(arr));
    }
    
    static int getCount(int arr[]){
       
        int count =0;
        int opsize = (int )Math.pow(2,arr.length);
        int num;
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();

        for(int i=1;i<opsize;i++){
            m.clear();
            boolean b = false;
            for(int j=0;j<arr.length;j++){
                if(BigInteger.valueOf(i).testBit(j)){
                    System.out.print(arr[j]+" ");
                    num = arr[j];
                    for(int l=0;l<=(int)Math.log10(arr[j]);l++){
                        int t = num%10;
                        if(m.get(t) == null){
                            m.put(t,1);
                            b=true;
                        }else{
                            b=false;
                             System.out.print("     -----"+(t)+"------   " );
                            break;
                        }
                        num = num/10;
                    }
                    if(b== false){
                        break;
                    }
                }
                    
            }
            if(b){
                    count++;
                    System.out.println("   count increatsed");
            }
            System.out.println();
        }
        
        return count;
    }
}



// boolean b= false;
// Map<Integer,Integer> m = new HashMap<Integer,Integer>();
// for(int k=i;k<=j;k++){
//     System.out.print(" "+arr[k]);
//     int num = arr[k];
//     // System.out.print(" "+arr[k]);
//     for(int l=0;l<=(int)Math.log10(arr[k]);l++){

//         int t= num%10;
//         if(m.get(t)== null ){
//             // System.out.print("----"+(t)+"------");
//             m.put(t,1);
//             // System.out.print("  digit ="+t+" freq: "+1);

//             b=true;
//         }else{
//             // System.out.println(" else executed for ("+ (t)+")");
//             b=false;
//             break;
//         }
//         num = num/10;
//     }