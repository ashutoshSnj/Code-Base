package start.build.logic;

import java.util.Scanner;

public class Perfect {
  public static void main(String[] args) {
	System.out.println("Enter the no = ");
	Scanner sc=new Scanner (System.in);
	int no=sc.nextInt();
	int result=0;
	for ( int i=1;i<no;i++) {
	  if(no%i==0){
		  result=result+i;
	  }
	}
	System.out.println(result);
	if(result==no) {
		System.out.println("No is Perfect");
	}
	else {
		System.out.println("No is not Perfect");
	}
}
}
