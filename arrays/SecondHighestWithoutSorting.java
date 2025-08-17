package start.build.arrays;

public class SecondHighestWithoutSorting {
  public static void main(String[] args) {
	int [] arr= {12,34,5,6,7,8,54,45};
	int no=arr[0];
	int Second_No=0;
	for(int i=1;i<arr.length;i++) {
			if(no<arr[i]) {
				Second_No=no;
				no=arr[i];	
		}
			else if(arr[i]>Second_No) {
				Second_No=arr[i];
			}
	}
	System.out.println(Second_No);
}
}
