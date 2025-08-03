package start.build.arrays;


import java.util.Arrays;

public class SecondHighest_no {
    public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,2,3,5};
		for(int i=0;i<arr.length;i++) {
			int temp;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	Arrays.stream(arr).forEach(ref->System.out.println(ref));
    }
}
