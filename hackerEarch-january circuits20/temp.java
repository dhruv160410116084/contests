import java.lang.Math;

class temp{
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(Math.log10(num));
        int temp = num;
        for(int i =0 ;i<(int)Math.log10(num);i++){
            System.out.println("in loop");
            System.out.println(temp%10);
            temp=temp/10;
        }
    }
}