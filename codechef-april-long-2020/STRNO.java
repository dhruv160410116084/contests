import java.io.*;
import java.util.*;

public class STRNO {
   
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();
            int T = Integer.parseInt(br.readLine());
            while(T--!= 0){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int K = Integer.parseInt(st.nextToken());
                int ctr=0;
                for(int i=2;i*i<=X;i++){
                    while(X%i == 0){
                        ctr++;
                        X=X/i;
                    }
                }
                if(X>0){
                    ctr++;
                }
                
                if(ctr>=K){
                    bw.write("1\n");
                }else
                    bw.write("0\n");

            }
            bw.flush();
            
        } catch (Exception e) {
            //TODO: handle exception
        }

    }
}

    