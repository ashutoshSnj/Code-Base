package start.build.pattern;

public class verticalTrangale {
     public static void main(String[] args) {
		int num=5;
		int count=1;
		int c1=1;
	/*	for(int i=0;i<num;i++) {
			if( i==0) {
				System.out.print("*");
			}
			else {
				
			
			for(int j=0;j<count;j++) {
				System.out.print("*");
				
				for(int k=0;k<c1;k++) {
					if(i==4) {
					
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
					
				}
				System.out.print("*");
				c1++;
			}
		
			}
			System.out.println();
		}  */
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
