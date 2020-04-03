import java.io.*;
import java.util.*;

class CARSELL {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int T = Integer.parseInt(br.readLine());
            long m = 1000000007;

            while (T-- != 0) {
                int N = Integer.parseInt(br.readLine());
                long arr[] = new long[N];
                long maxProf = 0;
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int i = 0; i < N; i++) {
                    arr[i] = Long.parseLong(st.nextToken());
                }
                Arrays.sort(arr);
                int i = N - 1;
                int red = 0;
                while (i >= 0) {
                    if (arr[i]-red > 0) {
                        maxProf =   (maxProf + arr[i]-red)%m ;
                    }
                    i--;
                    red++;
                }
                sb.append(maxProf + "\n");
            }
            System.out.println(sb);
        } catch (Exception e) {

        }
    }
}