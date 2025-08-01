package start.build.logic;

import java.util.Scanner;

public class Strong_No {
    public static void main(String[] args) {
		System.out.println("Enter the no = ");
		Scanner Sc=new Scanner(System.in);
		int no=Sc.nextInt();
		int temp=no;
		int rs=0;
		int result=0;
		while(no!=0) {
			int i=no%10;
			int temp1=i;
			for(int j=1;j<i;j++) {
				temp1=temp1*j;
			}
			System.out.println(temp1+"    "+i);
			result=result+temp1;
			no=no/10;
		}
		if(result==temp) {
			System.out.println("No is Strong");
		}
		else {
			System.out.println("No is Not Strong");
		}
	}
}
