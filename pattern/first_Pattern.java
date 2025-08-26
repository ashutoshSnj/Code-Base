package start.build.pattern;

public class first_Pattern {
  public static void main(String[] args) {
	int num=9;
	int count=9;
	  for(int i=0;i<num;i++) {
		  for(int j=count;j>=1;j--) {
			  System.out.print(j);
		  }
		  count--;
		  System.out.println();
	  }
}
}
