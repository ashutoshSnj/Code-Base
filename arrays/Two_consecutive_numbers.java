package start.build.arrays;

public class Two_consecutive_numbers {
  public static void main(String[] args) {
	int []arr= {1,31,-66,78,89,90};
	int result=0;
	int firstposition=0;
	int secondPosition=0;
	for(int i=0;i<arr.length;i++) {
		if(i==arr.length-1) {
			break;
		}
		if(arr[i]+arr[i+1]>result) {
			result=arr[i]+arr[i+1];
			firstposition=i;
			secondPosition=i+1;
		}
	}
	System.out.println("max sum of subbarry is = "+result+" at the "+firstposition+" and "+secondPosition+" index");
}
}
