import java.util.*;
//solved
class UniqueSubSequence {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = s.nextInt();
        int n = 0;
        String str = "";
        for(int i=0;i<t;i++){
            if(s.hasNextInt()){
                n = s.nextInt();
                str = s.next();
               int ans = solve(str);
               sb.append(ans+"\n");
            }
        }
        System.out.println(sb);


    }

    static int solve(String str){
        int ans=0,i=0,pt1=0,pt2=1,start=0;
        boolean findMathch = false;

        for( i=0;i<str.length() && pt1 < str.length() && pt2 < str.length();i++){
            if(str.charAt(pt1) == str.charAt(pt2)){
                pt1 ++;
                pt2 ++;
                start++;
            }else{
                 pt1 ++;
                pt2 ++;
            }
         
        }
        return pt2 - start;
    }
}
