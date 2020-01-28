

import java.io.BufferedReader;
import java.io.InputStreamReader;

//final solution

class DistrubuteChocolate {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());                // Reading input from STDIN
        long C[] = new long[T];                                               // Writing output to STDOUT
        long N[] = new long[T];    
        String temp[] = new String[2];
        for(int i=0;i<T;i++){
            temp = br.readLine().split("\\s");
            C[i]=Long.parseLong(temp[0]);
            N[i]=Long.parseLong(temp[1]);
        }
        
        for(int i=0;i<T;i++){
          if(N[i]*(N[i]+1)/2 > C[i]){
              System.out.println(C[i]);
          }else{
              long k = (C[i]-N[i]*(N[i]-1)/2)/N[i];
              System.out.println(C[i]-N[i]*k-N[i]*(N[i]-1)/2);
          }
        }
        
    }

}