package start.build.logic;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no = ");
		int no=sc.nextInt();
		int num1=no;
		int result=no;
		int size=0;
		int output=0;
		for (int i=0;no!=0;i++) {
			size=size+1;
		  no =no/10;
		}
		System.out.println(size);
		int val=0;
		for(int i=0;num1!=0;i++) {
		      val=num1%10;
		     int temp=val;
		      for(int j=1;j<size;j++) {
		    	 val=val*temp;  
		      }
		      System.out.println(val);
		      output=output+val;
		      num1=num1/10;
		}
		 if(result==output) {
			 System.out.println("no is Amstrong");
		 }
		 else {
			 System.out.println("No not Amstrong");
		 }
	}
}
