package com.shashank;

public class ReverseArray {
    public static void main(String[] args) {

        int[] nums = {10,5,8,6,20};

        int start = 0;
        int end = nums.length-1;

        while (start<end){

            swap(nums,start,end);
            start++;
            end--;
        }

        for (int val:nums) {

            System.out.print(val + " ");
        }

    }

    private static void swap(int[] nums, int a, int b) {

        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;

    }
}
