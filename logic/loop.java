package start.build.logic;

public class loop {
  public static void main(String[] args) {
	  for (int i = 0; i < 5; i++) {
		    System.out.println("Inside body, i = " + i);
		}
	  for (int i = 0; i < 5; ++i) {
		    System.out.println("Inside body, i = " + i);
		}

}
}
