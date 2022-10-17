package org.example;

import java.lang.reflect.Array;

public class MissingNumber {

    public static int getMissingNumber(int[] nums, int max){

        for(int i = 0; i < nums.length; i++) {
            if(nums[i+1] != nums[i] + 1){
                return nums[i]+1;

            }

        }
        return 0;
}}
