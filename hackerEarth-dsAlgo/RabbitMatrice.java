import java.util.*;
//unsolved
class RabbitMatrice {
    static boolean dp[][] = new boolean[100][100];
    public static void main(String args[] ) throws Exception {



        Scanner s = new Scanner(System.in);
        long q = s.nextInt();
        StringBuilder sb = new StringBuilder();
        int x=0,y=0;
        dp[1][1] = true;

        for(long i=0;i<q;i++){
            x = s.nextInt();
            y = s.nextInt();
            sb.append(dp[x][y] + "\n");
        }
       System.out.println(sb);
    }



    static boolean  compute(int x,int y){
        
        
          

}
}
