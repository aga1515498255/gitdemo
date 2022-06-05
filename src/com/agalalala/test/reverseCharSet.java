package com.agalalala.test;

public class reverseCharSet {

    char[] arg = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};

    public static void main(String[] args) {
        reverseCharSet reverseCharSet = new reverseCharSet();
        reverseCharSet.reverseString(reverseCharSet.arg);
        for (int i = 0; i < reverseCharSet.arg.length; i++) {
            System.out.print(reverseCharSet.arg[i]);
        }
    }


    public void reverseString(char[] s) {
        for(int i = 0;i<=s.length/2;i++){
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
    }
}
