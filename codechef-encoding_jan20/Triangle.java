

import java.util.Scanner;
import java.lang.*;
import java.io.*;

//solution is accepted by codechef
class Triangle
{
	public static void main (String[] args)
	{
		
		try{
		    Scanner scan = new Scanner(System.in);
	int T = scan.nextInt();
	int arr[] = new int[T];
	int a=0,b=0,c=0;
	for(int i=0;i<T;i++){
	    if(scan.hasNextInt()){
	             a = scan.nextInt();
	    }
	     if(scan.hasNextInt()){
	             b = scan.nextInt();
	    }
	     if(scan.hasNextInt()){
	             c = scan.nextInt();
	    }
	    if(a!=0 && b!= 0 && c!= 0 && a+b+c == 180){
	                    arr[i] = 1;
	            }
	}
	for(int i=0;i<T;i++){
	    if(arr[i]==1){
	        System.out.println("YES");
	   
	    }
	     else    
	        System.out.println("NO");
	}

	scan.close();
		}catch(Exception e){
		  
		}
	
	}
	
}
