package com.shashank;

public class SelectionSort {
    public static void main(String[] args) {

        int[]  nums = {10,30,1,5,8,35};

        selectionSort(nums);
    }

    private static void selectionSort(int[] nums) {

        for (int jc = 1; jc <=nums.length-1 ; jc++) {

            for (int i = jc; i <nums.length ; i++) {

                if (nums[i]<nums[jc-1]){

                    swap(nums,i,jc);
                }
            }
        }

        for (int val:nums) {

            System.out.print(val + " ");
        }
    }

    private static void swap(int[] nums, int i, int jc) {

            int temp = nums[i];
            nums[i] = nums[jc-1];
            nums[jc-1] = temp;

    }
}
