package start.build.arrays;

public class Max_SubArray {
  public static void main(String[] args) {
	int [] arr= {1,23,4,5,6,6,-7,7,88,99};
	int result=0;
	for(int i=0;i<arr.length;i++) {
		int temp=0;
		for(int j=i;j<arr.length;j++) {
			temp=temp+arr[j];
			if(result<temp) {
				result=temp;
			}
		}
		
	}
	System.out.println(result);
}
}
