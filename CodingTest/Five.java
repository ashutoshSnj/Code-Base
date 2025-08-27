package start.build.CodingTest;

public class Five {
  /*
   *          1
   *         121
   *        12321
   */
	
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
		  for(int j=1;j<=3-i;j++) {
			  System.out.print("  ");
		  }
		  for(int k=1;k<=i;k++) {
			  System.out.print(k+" ");
		  }
		  for(int l=i-1;l>=1;l--) {
			  System.out.print(l+" ");
		  }
		  System.out.println();
		}
	}
}
