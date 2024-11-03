package com.manat.java.school;

public class IfDemo {
    public static void main(String[] args ) {

        //int number = -10;
        // number > 0 => positive
        // number < 0 => negative

        //if(number > 0) {
            //System.out.print("Positive");
        //}

        //if(number < 0){
           // System.out.println("Negative");
       // }

        //if(number%2 == 0){
            //System.out.println("even");
        //}else {
           // System.out.println("odd");
       // }

        // score = 80
        /*
        * condition of grade:
        * score >= 90 => 'A'
        * score >= 80 => 'B'
        * score >= 70 => 'C'
        * score >= 60 => 'D'
        * score >= 50 => 'E'
        * score < 50 => 'F'
         */

        double score = 80;
        char grade = 'F';
        if(score >= 90) {
            grade = 'A';
        }else if(score >= 80) {// score < 90 [80, 89]
            grade = 'B';
        }else if(score >= 70) { // score < 80
            grade = 'C';
        }else if(score >= 60) {
            grade = 'D';
        }else if(score >= 50) {
            grade = 'E';
        }else {
            grade = 'F';
        }

        System.out.println(grade);

    }
}
