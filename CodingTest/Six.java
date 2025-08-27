
package start.build.CodingTest;

public class Six {
/* 
 * 1 2 3 2 1
 *   1 2 1
 *     1  
 */
	public static void main(String[] args) {
		
		for (int i=0;i<3;i++) {
			for(int s=0;s<i;s++) {
				System.out.print("  ");
			}
			for(int j=1;j<=3-i;j++ ) {
				System.out.print(j+" ");
			}
			for(int k=3-1-i;k>=1;k--) {
				System.out.print(k+" ");
			}
				
			System.out.println();
		}
	}
}
