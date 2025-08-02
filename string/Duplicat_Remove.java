package start.build.string;

import java.util.Scanner;

public class Duplicat_Remove {
   public static void main(String[] args) {
	System.out.println("Enter the String = ");
	Scanner sc=new Scanner (System.in);
	StringBuilder str=new StringBuilder(sc.nextLine());
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j)) {

				for(int k=j;k<str.length()-1;k++) {
				
					str.setCharAt(k,str.charAt(k+1));
				}
				str.setLength(str.length()-1);
				j--;
			} 
			
		}
	}
	System.out.println(str);
	
     StringBuffer strr=new StringBuffer(sc.nextLine());
     boolean [] obj=new boolean[256];
     int pos=0;
     for(int m=0;m<str.length();m++) {
    	 char ch=str.charAt(m);
    	 if(!obj[ch]) {
    		 obj[ch]=true;
    		 strr.setCharAt(pos, ch);
    		 pos++;
    	 }
    	
     }
     strr.setLength(pos);
	 System.out.println("String after removing duplicates: " + strr);
}
}
