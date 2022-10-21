class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int flag = 1;
        int i;
        for (i = 0; i < nums.length; i++) {

            try {
                if (nums[i] == nums[i + 1]) {
                    flag++; 
                    continue;
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            if (flag <= nums.length / 2) {
                flag = 1;
            }else {
                return nums[i];
            }
        }

        return flag;
    }
}
