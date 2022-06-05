package com.agalalala.test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int [] ars = {1,2,3,4,5,6,7};
        Solution solution = new Solution();
        solution.rotate(ars,3);
        for (int i = 0; i < ars.length; i++) {
            System.out.print(ars[i]);
        }
    }
}

class Solution {
    public void rotate(int[] nums, int k) {

        if(nums.length<k){
            k = k%nums.length;
        }

        if(nums.length==k||k==0)return;

        //保存数组尾部错误的K个数字；
        int[] temp = new int[k];
        for(int i = 0;i<k;i++){
            temp[i] = nums[nums.length-k+i];
        }

        //从倒数第k个的前一个开始
        for(int i = nums.length-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        //补上前k个
        for(int i = 0;i<k;i++){
            nums[i] = temp[i];
        }


    }
}
