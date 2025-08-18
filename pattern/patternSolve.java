package start.build.pattern;

public class patternSolve {
    public static void main(String[] args) {
		int print=1;
    	for(int i=0;i<5;i++) {
			for(int j=1;j<=print;j++) {
				System.out.print(j+" ");
			}
			print++;
			System.out.println();
		}
	}
}
