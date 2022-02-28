package io.github.shishir;

import java.util.*;
import java.util.function.Supplier;

public class Main{
    public static void main(String[] args) {
        int[] num1 = {2,15,10,11,14,12,14,11,9,1};
        int[] num2 = {8,9,13,2,11,8};
        int[] num3 = {13,5,15,7,12,7,8,3,13,15};
        Main obj = new Main();
        ArrayList<Integer> x = (ArrayList<Integer>) obj.twoOutOfThree(num1, num2, num3);
        System.out.println(x.toString());
    }


        public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

            int i,j,k;
            ArrayList<Integer> list = new ArrayList<Integer>();

            for(i=0; i<nums1.length; i++){
                for(j=0; j<nums2.length; j++){
                    for(k=0; k<nums3.length; k++){
                        if (nums1[i] == nums2[j] || nums1[i] == nums3[k]){
                            list.add(nums1[i]);
                        } else if(nums2[j] == nums3[k]){
                            list.add(nums3[k]);
                        }

                    }
                }



            }
            ArrayList<Integer>
                    newList = removeDuplicates(list);
            return newList;

        }

        public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
        {

            // Create a new ArrayList
            ArrayList<T> newList = new ArrayList<T>();

            // Traverse through the first list
            for (T element : list) {

                // If this element is not present in newList
                // then add it
                if (!newList.contains(element)) {

                    newList.add(element);
                }
            }

            // return the new list
            return newList;
        }
    }