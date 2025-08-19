package start.build.LeetCode.Daily_Question;

public class zeroFilledSubarray {
	public static void main(String[] args) {
		int [] arr= {1,3,0,0,2,0,0,4};
		System.out.println(zeroFilledSubarray(arr));
	}
	 public static long zeroFilledSubarray(int[] nums) {
	        long result=0;
	        long no=0;
	        for(int i=0;i<nums.length;i++){
	         /*   if(nums[i]==0){
	               result=result+1;
	                for(int j=i+1;j<nums.length;j++){
	                    if(nums[j]==0){
	                       result= result+1;
	                    }
	                    if(nums[j]!=0){
	                        break;
	                    }*/
	        	
	        	 if(nums[i]==0){
	        		 no++;
	        	 }
	        	 else {
	        		 result+=no*(no+1)/2;
	        		 no=0;
	                }
	            }
	        
	        return result;
	    }
}
