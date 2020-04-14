import java.io.*;
import static java.lang.Integer.*;

class UnitGcd{
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int T = parseInt(br.readLine()); 
            while(T-- != 0){
                int N = parseInt(br.readLine());
                if(N==1){
                    bw.write("1\n1 1\n");
                }
                else if(N==2){
                    bw.write("1\n2 1 2\n");
                }
                else if(N==3){
                    bw.write("1\n3 1 2 3\n");
                }
                else{
                    bw.write((N/2)+"\n");
                    bw.write("3 1 2 3\n");
                    for(int i=4;i<=N;i+=2){
                        if( i+1 <= N )
                            bw.write("2 "+i+" "+(i+1));
                        else
                            bw.write("1 "+i);
                         bw.newLine();
                    }
                }
                
            }

            bw.flush();


        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}