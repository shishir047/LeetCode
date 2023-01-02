class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int flag=0;
        int a=0;
        Arrays.sort(nums);
        for(int i=0; i<len; i++){
            if(i==(len-1) && nums[i]==i){
                a=len;  
                break;  
            }else{ 
             
                 if(nums[i]==i){
                        continue;
                    }else{
                        a=i;
                        break;
                 }
            }
        } 
        return a;
    }
}
