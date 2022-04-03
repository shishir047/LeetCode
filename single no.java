class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        else{
            int i,j;
            int flag = 0;
            for (i = 0; i <= nums.length - 1; i++, flag =0) {
                for (j = 0; j < nums.length; j++) {
                    if(nums[i]==nums[j]){
                        flag++;
                    }
                    
                }
                if(flag==1){
                    return nums[i];
                }
            }
        }
    
    return -1;}
}