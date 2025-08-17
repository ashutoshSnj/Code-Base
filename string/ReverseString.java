package start.build.string;

import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {
	System.out.println("Enter the string= ");
	Scanner sc=new Scanner(System.in);
	StringBuffer str=new StringBuffer(sc.nextLine());
	int len=str.length()-1;
	for(int i=0;i<str.length()/2;i++) {
		char temp=str.charAt(i);
		str.setCharAt(i, str.charAt(len));
		str.setCharAt(len, temp);
		len--;
	}
	System.out.println(str);
	}
}
