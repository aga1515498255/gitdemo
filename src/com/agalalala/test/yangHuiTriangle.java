package com.agalalala.test;

public class yangHuiTriangle {

    public static void main(String[] args) {
        yangHuiTriangle yangHuiTriangle = new yangHuiTriangle();
                yangHuiTriangle.printTriangle(10);
    }

    public void printTriangle(int n){
        int [] row = new int[n];
        row[0] = 1;
        int temp = row[0];
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i ; j++){
                if (j==0||j==i-1) {
                    System.out.print(1+" ");
                    row[j]=1;
                }else {
                    int t = row[j];
                    row[j] = temp + row[j];
                    temp = t;
                    System.out.print(row[j]+" ");
                }
            }
            System.out.print("\n");
        }
    }
}
