class Solution {
   public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target || nums[i]>target){
                return i;
            }else{
                if(target>nums[i] && i==nums.length-1){
                    return i+1;
                }else{
                    continue;
                }
            }
        }

        return -1;
    }
}