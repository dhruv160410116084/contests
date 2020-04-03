import java.io.*;
import java.util.*;

 class COVIDLQ {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int T = Integer.parseInt(br.readLine());
            while(T-- != 0){
                int N = Integer.parseInt(br.readLine());
                StringTokenizer st = new StringTokenizer(br.readLine());
                int arr[] = new int[N];
                ArrayList<Integer> oneIndexList = new ArrayList<Integer>();
                
                
                for(int i=0;i<N;i++){
                    arr[i] = Integer.parseInt(st.nextToken());
                    if(arr[i] == 1)
                        oneIndexList.add(i);
                }
                if(oneIndexList.size() == 1)
                     sb.append("YES\n");
                else{
                    boolean flag = false;
                    for(int i=1;i<oneIndexList.size();i++){
                        int fIdx= oneIndexList.get(i-1);
                        int sIdx = oneIndexList.get(i);
                        if(sIdx - fIdx >= 6){
                            flag = true;
                        }
                        else{
                            flag=false;
                            break;
                        }
                    }
                    if(flag)
                        sb.append("YES\n");
                    else
                    sb.append("NO\n");
                }
               
            }
            System.out.println(sb);
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}