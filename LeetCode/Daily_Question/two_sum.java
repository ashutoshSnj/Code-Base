package start.build.LeetCode.Daily_Question;

class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] result=new int[2];
       boolean flag=true;
        for(int i=0;i<nums.length;i++){
         if(flag==false){
            break;
         }
          for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
               result[0]=i;
               result[1]=j;
               flag=false;
                break;
            }
          }   
        }
        return result;
    }
}