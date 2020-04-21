import java.io.*;
import java.util.*;
import static java.lang.Integer.*;
// import static java.lang.Long.*;
import static java.lang.Math.*;
// import static java.lang.String.*;
// import static java.util.Arrays.*;

public class P {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int T = parseInt(br.readLine()); 
            while(T-- != 0){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = parseInt(st.nextToken());
                int Q = parseInt(st.nextToken());
                int f[] = new int[Q];
                int d[] = new int[Q];
                long ans =0;
                for(int i=0;i<Q;i++){
                    st = new StringTokenizer(br.readLine());
                    f[i] = parseInt(st.nextToken());
                    d[i] = parseInt(st.nextToken());
                }
                ans = f[0]-ans;
                ans = ans+abs(f[0]-d[0]);
                for(int i=1;i<Q;i++){
                    ans = ans + abs(d[i-1]-f[i]);
                    ans = ans + abs(f[i]-d[i]);
                }
                bw.write(ans+"\n");
            }
            bw.flush();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }

}

}