import java.io.*;
import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.String.*;
import static java.util.Arrays.*;

public class RECNDSTR {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int T = parseInt(br.readLine()); 
            while(T-- != 0){
                // int N = parseInt(br.readLine());
                String str = br.readLine();
                boolean res = false;
                int N = str.length();
                // StringBuilder l = new StringBuilder();
                // StringBuilder r = new StringBuilder();
                if(N==2)
                    res = true;
                else{
                    for(int i = 0 ;i<N;i++){
                        if(str.charAt( (i+1)%N ) == str.charAt( (N+i-1)%N)  )
                            res = true;
                        else{
                            res = false;
                            break;
                        }    
                        // l.append(str.charAt( (i+1)%N ));
                        // r.append(str.charAt( (N+i-1)%N));


                }
                }
                

                if(res)
                    bw.write("YES");
                else
                    bw.write("NO");
                bw.newLine();
                // System.out.println(l+"\n"+r);

            }
            bw.flush();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
    static int[] takeInputArray(String str, int len) {
        StringTokenizer st = new StringTokenizer(str);
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = parseInt(st.nextToken());
        }
        return arr;
    }

}