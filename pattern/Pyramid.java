package start.build.pattern;



public class Pyramid {
  public static void main(String[] args) {
	  int no=5;
	  int count=1;
	for(int i=0;i<5;i++) {
		
		for(int j=0;j<no;j++ ) {
			System.out.print(" ");
		}
		for(int k=0;k<count;k++) {
			System.out.print("*");
		}
		no--;
		count=count+2;
		System.out.println();
	}
}
}
