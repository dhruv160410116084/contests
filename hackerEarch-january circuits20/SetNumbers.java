import java.util.*;
import java.lang.Math;
class SetNumbers{                                            //old = 12368
    public static void main(String[] args) {                   //new = 4242
        long start = System.currentTimeMillis();
        Scanner scan = new Scanner(System.in);
        int noOfTest = scan.nextInt();
        int numbers[] = new int[noOfTest];
        // int temp = Integer.toBinaryString(315).length();
        // System.out.println("temp :"+temp+"    type :" +Integer.toBinaryString(315).getClass().getName());
        for(int i=0;i<noOfTest;i++){
            numbers[i] = scan.nextInt();    
        }
        for(int i=0;i<noOfTest;i++){
            int t= (int)Math.pow(2, Integer.toBinaryString(numbers[i]).length()-2);
            while((t|(t+1))<=numbers[i]){
                t |=t+1;
            }
            System.out.println(t);
        long end = System.currentTimeMillis();
        System.out.println("execution timne :"+(end-start));
        }
    }
}