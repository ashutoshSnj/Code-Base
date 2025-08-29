package start.build.CodingTest;

public class First {
 public static void main(String[] args) {
	 /*
	  *  987654321
	  *  87654321
	  *  7654321
	  *  654321
	  *  54321
	  *  4321
	  *  321
	  *  21
	  *  1 
	  */
	 for(int i=9;i>=1;i--) {
		for(int j=i;j>=1;j--) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
