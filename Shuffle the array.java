package io.github.shishir;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int array[] = {2,5,1,3,4,7}; // Output: [2,3,5,4,1,7]
        System.out.println(Arrays.toString(main.shuffle(array , 3)));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int flag = 0;
        for(int i = 0, j = n ; i<n;  ){
            flag++;
            if(flag%2!=0){
                arr[flag-1] = nums[i];
                i++;
            }else{
                arr[flag-1] = nums[j];
                j=i+n;
            }
        }
        arr[nums.length-1] = nums[nums.length-1];
        return arr;
    }

}