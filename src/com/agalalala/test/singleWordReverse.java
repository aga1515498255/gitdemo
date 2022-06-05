package com.agalalala.test;

public class singleWordReverse {

    String arg = "Let's take LeetCode contest";

    public static void main(String[] args) {
        singleWordReverse reverse = new singleWordReverse();
        System.out.println(reverse.reverseWords(reverse.arg));
    }


    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int right = 0;
        for(;right<=str.length;right++){
            if(right==str.length||str[right]==' ') {

                for (int i = 0; i < (right - left) / 2; i++) {
                    char temp = str[left + i];
                    str[left + i]=  str[right - i - 1];
                    str[right - i - 1]=temp;
                }

                    left = right+1;
            }
        }

        return new String(str);
    }
}
