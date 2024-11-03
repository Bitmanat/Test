package com.manat.java.school;

public class SwitchDemo {

    public static void main(String[] args) {

        /*
        * switch(expression){
        * case case1 : statement; break;
        * case case2 : statement; break;
        * case case3 : statement; break;
        * .....
        * [default: statement;]
        * }
        *
        *
         */

        // input day number => output day name;
        // 1 => Monday;
        // 7 => Sunday;

        int dayNumber = 5;

        switch (dayNumber) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;

        }
    }
}
