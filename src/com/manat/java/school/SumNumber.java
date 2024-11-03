package com.manat.java.school;

public class SumNumber {

    public static void main(String[] args){

        // 1 + 2 + 3 + 4
        // 25 + 26 + 27 + 28
        // u1 = ?

        //un = ?
        //sum = n(n1+un)\2

        int u1 = 25;
        int un = 28;
        int cardinal = un - u1 + 1;
        int sum = cardinal * (u1 + un)/2;

        System.out.print("sum=" + sum);
    }
}
