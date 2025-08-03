package start.build.arrays;

import java.util.Arrays;

public class RemoveDuplicate {
   public static void main(String[] args) {
	int []arr=new int[]{
	12,85,96,985,85,65,62,85,9529
	};
	int length=arr.length;
	for(int i=0;i<length;i++) {
		for(int j=i+1;j<length;j++) {
			if(arr[i]==arr[j]) {
				for(int k=j;k<length-1;k++) {
					arr[k]=arr[k+1];
					
				}
				
				length--;
				j--;
			}
		}
	}
	for(int p=0;p<length;p++) {
		System.out.println(arr[p]);
	}
}
}
