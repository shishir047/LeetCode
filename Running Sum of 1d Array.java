package io.github.shishir;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int array[] = {3,1,2,10,1}; // Output: [1,3,6,10]
        System.out.println(Arrays.toString(main.runningSum(array)));
    }
 
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            arr[i] = sum;
        }
        return arr;
    }

}
