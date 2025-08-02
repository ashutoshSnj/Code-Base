package start.build.string;

import java.util.Scanner;

public class First_NoN_Repeating_Cahr {
   public static void main(String[] args) {
	System.out.println("Enter the String = ");
	Scanner Sc=new Scanner(System.in);
	StringBuilder str=new StringBuilder(Sc.nextLine());
    boolean found = false;
	for(int i=0;i<str.length();i++) {
		 boolean flag=true;
		for(int j=0;j<str.length();j++) {
			if(i!=j && str.charAt(i)==str.charAt(j)) {
				flag=false;
				break;
			}
		}
		if (flag) {
            System.out.println(str.charAt(i) + " is the First non-repeating character.");
            found = true;
            break;
        }
		}
	if(!found) {
		 System.out.println("There is no non-repeating character.");
	}
		
		
	}
		

}
