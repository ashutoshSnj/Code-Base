package start.build.pattern;

public class inverted_right_angled_triangle {
   public static void main(String[] args) {
	   int num=5;
	for(int i=0;i<5;i++) {
		for(int j=0;j<num;j++) {
			System.out.print("* ");
		}
		num--;
		System.out.println();
	}
}
}
