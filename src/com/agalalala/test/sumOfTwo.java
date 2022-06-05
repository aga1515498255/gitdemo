package com.agalalala.test;

public class sumOfTwo {
    int [] arg = {2,7,11,15};
    int target = 9;

    public static void main(String[] args) {
        sumOfTwo sumOfTwo = new sumOfTwo();
        int[] res = sumOfTwo.solution(sumOfTwo.arg, sumOfTwo.target);
        System.out.println(res[0]+"\n"+res[1]);
    }


    int [] solution(int [] numbers,int t){
        int[] res = new int[2];

        for(int i = 1;i<numbers.length-1;i++){
            res[0] = i;
            for(int j = i+1;j<numbers.length;j++){
                if(t-numbers[i]==numbers[j]){
                    res[1] = j;
                    return res;
                }
            }
        }
        return null;
    }


}
