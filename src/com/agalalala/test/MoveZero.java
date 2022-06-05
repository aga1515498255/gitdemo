package com.agalalala.test;


import java.util.ArrayList;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，
 * 同时保持非零元素的相对顺序。
 *请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 *
 *
 * */
public class MoveZero {
    int []arg = {0,1,0,3,12};

    public static void main(String[] args) {
        MoveZero moveZero = new MoveZero();
        moveZero.solution(moveZero.arg);
        for (int i = 0; i < 5; i++) {
            System.out.println(moveZero.arg[i]);
        }
    }
    public void solution(int[] nums){
        ArrayList<Integer> stack = new ArrayList<>();
        int stacktop = -1;
        int butten = 0;
        int zeroCount = 0;
        for(;butten< nums.length;butten++){
            if(nums[butten]==0)break;
        }
        if(butten==nums.length-1)return;
        for (int i = nums.length-1; i >= butten; i--) {
            if(nums[i]!=0){
                stacktop++;
                stack.add(nums[i]);

            }else {
                zeroCount++;
                nums[nums.length-zeroCount] = 0;
            }
        }
        for(;butten<nums.length-zeroCount;butten++){
            nums[butten]=stack.get(stacktop);
            stacktop--;
        }
    }
}
