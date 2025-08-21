package start.build.pattern;

import java.util.Arrays;

public class four_four_Matrix {
   public static void main(String[] args) {
	   int num=1;
	   int arr[][]=new int [4][4];
	for(int i=0;i<4;i++) {
		for(int j=0;j<4;j++) {
			System.out.print(num+"  ");
			arr[i][j]=num;
			num++;
		}
		System.out.println();
		
	}
	Arrays.stream(arr).forEach(ref->{ Arrays.stream(ref).forEach(a->System.out.println(a+" "));
	System.out.println();
	});
	}

	
}

