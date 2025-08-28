package start.build.CodingTest;

public class Second1 {
   /*
    *    687954321
    *    87954321
    *    7954321
    *    954321
    *    54321
    *    4321
    *    321
    *    21
    *    1
    * 
    */
	 public static void main(String[] args) {
		/*  String s = "687954321";   // starting string

	        for (int i = 0; i < s.length(); i++) {
	            System.out.println(s.substring(i));
	        } */
		 int[] arr= {6,8,7,9,5,4,3,2,1};
		 for(int i=0;i<9;i++) {
			 for(int j=i;j<arr.length;j++) {
				 System.out.print(arr[j]);
			 }
			 System.out.println();
		 }
	    }
}
