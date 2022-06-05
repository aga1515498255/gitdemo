package com.agalalala.test;

public class permutationOfString {

    public static void main(String[] args) {

    }


    public boolean checkInclusion(String s1, String s2) {
        boolean[] flags = new boolean[s1.length()];
        char[] str = s1.toCharArray();
        for(int i = 0 ; i<s2.length();i++ ){
            for(int j = i ; j<= s2.length()-s1.length();j++){
                if(hasCharOf(s2.charAt(i),flags,str)){
                    if (j-i==s1.length()-1)return true;
                }
            }
        }
        return false;
    }

    private boolean hasCharOf(char ch,boolean[] flags,char[] s1){
        for(int i = 0; i<flags.length;i++){

            if(flags[i]==false){
                continue;
            }else if (ch == s1[i]){
                    flags[i]=false;
                    return true;
                }

        }
        return false;

    }
}
