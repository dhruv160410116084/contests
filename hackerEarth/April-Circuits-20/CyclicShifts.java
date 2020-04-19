    import java.io.*;
    import java.util.*;
    import static java.lang.Integer.*;
    import static java.lang.Long.*;
    // import static java.lang.Math.*;
    import static java.lang.String.*;
    import static java.util.Arrays.*;    


    class CyclicShifts{
        public static void main(String[] args) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                int T = parseInt(br.readLine()); 
                while(T-- != 0){
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    char  N = (char)Integer.parseInt(st.nextToken());
                    int m = parseInt(st.nextToken());
                    char c = st.nextToken().charAt(0);
                    String str = Integer.toBinaryString(N);
                    int len = str.length();
                    int ans =0;
                    if(str.length()!= 16){
                        while(len != 16){
                            str = "0"+str;
                            len++;
                        }
                    }
                    // System.out.println(str);
                    if(c == 'L'){
                        String temp = str.substring(0,m);
                        String number = str.substring(m).concat(temp) ;
                        // System.out.println(number);
                        ans = Integer.parseInt(number,2);
                    }
                    if(c == 'R'){
                        String temp = str.substring(str.length()-m,str.length());
                        String number = temp.concat(str.substring(0,str.length()-m));
                        ans = Integer.parseInt(number,2);
                    }

                    bw.write(ans+"\n");
                }

                
                bw.flush();
            } catch (Exception e) {
                //TODO: handle exception
                // System.out.println(e);
            }
        }
    }
