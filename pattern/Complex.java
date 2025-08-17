package start.build.pattern;

public class Complex {
   public static void main(String[] args) {
	int no=0;
	int count=5;
	int str=1;
	while(no<10) {
		if(no<4) {
			for(int i=0;i<count;i++) {
				System.out.print(" ");
			}
			for(int j=0;j<str;j++) {
				System.out.print("*");
			}
			str=str+2;
			count--;
			System.out.println();
			no++;
		
		}
		else {
			for(int i=0;i<count;i++) {
				System.out.print(" ");
			}
			count++;
			for(int j=0;j<str;j++) {
				System.out.print("*");
			}
			str=str-2;
			System.out.println();
			no++;
		}
	}
   }
}
