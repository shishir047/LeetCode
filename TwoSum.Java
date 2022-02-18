class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int i, j, k;
        int[] l;
        l = new int[2];

        for (i=0; i<nums.length; i++){
            for (j=1; j<nums.length; j++){
                if(i!=j && nums[i]+nums[j]==target && j>i){
                    l[0]=i;l[1]=j;

                }
            }
        }
        return l;
    }
}