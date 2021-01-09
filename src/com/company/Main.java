package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
 //задание 1
        System.out.println("Задание 1");
         int[] nums = {1, 1, 1, 0, 0};
         for (int i = 0; i < nums.length; i++) {
             if (nums[i] == 1){
                 nums[i] = 0;
             }else {
                 nums[i] = 1;
             }
             System.out.println(nums[i] + " ");
         }
 //задание 2
         System.out.println("Задание 2");
         int [] nums2 = new int[8];
         for (int x = 0; x < nums2.length; x++)
         {
             nums2[x] = x * 3;
             System.out.print(nums2[x] + " ");
         }
//задание 3
        System.out.println("\n Задание 3");
        int [] nums3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 0, 1};
        System.out.print("\n");
        for (int a = 0; a < nums3.length; a ++) {
            if (nums3[a] < 6) {
                nums3[a] = nums3[a] * 2;
            }
            System.out.print(nums3[a] + " ");
        }
 //задание 4
         System.out.println("\n Задание 4");
         int [][] nums4 = new int[4][4];
         for (int o = 0; o < nums4.length; o ++){
             for (int j = 0, j2 = nums4[o].length; j < nums4[o].length; j ++, j2--){
                 if (o == j || o == (j2 - 1)) nums4[o][j] = 1;
                 System.out.print(nums4[o][j] + " ");
             } System.out.println();
         }
 //Задание5
         System.out.println("Задание 5");
         int [] numsMin = {1, 2, 3,};
         int min = numsMin[0];
         for (int s = 2; s < numsMin.length; s ++){
             if( numsMin[s] < min){
                 min = numsMin[s];
             }
             System.out.println(min);
         }
         int [] numsMax = {1, 2, 3,};
         int max = numsMax[0];
         for (int s = 2; s < numsMax.length; s ++){
             if( numsMax[s] >  min){
                 max = numsMax[s];
             }
             System.out.println(max);
         }
//Задание 6
        System.out.println("\n Задание 6");
        int[] test = {1, 10, 3, 4, 5, 5};
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
        System.out.println(checkSummPartues(test));
 //Задание7
            int [] arr7 = {1, 2, 3, 4, 5};
        System.out.println("Задание 7");
        shiftArr(arr7,-3);
    }

    public static boolean checkSummPartues(int[] arr) {
        int sumTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            sumTotal += arr[i]; // сумма массива
        }
        int sumR = 0;
        int suml = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            suml += arr[i - 1];
            sumR = sumTotal - suml;
            if (sumR == suml) {
                return true;
            }
        }
        return false;
    }

//задание7   проблема с которой не смогла разобраться: если задавать число больше 1 для сдвига массива, он циклично
//по одному меняет элементы из-за х, решить по другому не смогла, что бы было готовы только 1-й вариант и последний- правильный
    private static void shiftArr (int[]arr2, int n) {
        for (int i : arr2) System.out.print(i + " ");
            if (n > 0) {
                for (int x = 0; x < n; x ++) {
                    int sft = arr2[arr2.length - 1];
                    if (arr2.length - 1 >= 0) System.arraycopy(arr2, 0, arr2, 1, arr2.length - 1);
                    arr2[0] = sft;
                    System.out.print("\n ");
                    for (int i : arr2) System.out.print(i + " ");
                }
            }else{
                for (int x = 0; x > n; x--) {
                    int sft = arr2[0];
                    System.arraycopy(arr2, 1, arr2, 0, arr2.length - 1);
                    arr2[arr2.length - 1] = sft;
                    System.out.print("\n ");
                    for (int i : arr2) System.out.print(i + " ");
                }
            }


    }






}








