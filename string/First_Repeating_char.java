package start.build.string;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class First_Repeating_char {
	public static void main(String[] args) {
		System.out.println("Enter the String = ");
		Scanner Sc=new Scanner(System.in);
		StringBuilder str=new StringBuilder(Sc.nextLine());
		int flag=-1;
		outer:
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					flag=i;
					break outer;
				}
				
			}
	
		}
		if(flag>=0) {
			System.out.println(str.charAt(flag)+" "+"character is first Repeating char ");
		}
		else {
			System.out.println("this string no contain any repeating charachter");
		}
	}
}
