package com.shashank;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < nums.length; i++) {

            nums[i] = scanner.nextInt();
        }

        selectionSort(nums);
    }

    private static void selectionSort(int[] nums) {

        for (int jc = 1; jc <= nums.length - 1; jc++) {

            for (int i = jc; i < nums.length; i++) {

                if (nums[i] < nums[jc - 1]) {

                    swap(nums, i, jc);
                }
            }
        }

        for (int val : nums) {

            System.out.print(val + " ");
        }
    }

    private static void swap(int[] nums, int i, int jc) {

        int temp = nums[i];
        nums[i] = nums[jc - 1];
        nums[jc - 1] = temp;

    }
}
