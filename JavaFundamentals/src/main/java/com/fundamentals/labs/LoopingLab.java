package com.fundamentals.labs;

import java.sql.SQLOutput;

public class LoopingLab {
    public static void main(String[] args) {
        Numberdisplay();
    }
    public static void Numberdisplay() {
        int count =0;
        while (count <= 15) {
            if(count == 5) {
                System.out.println("five");
            } else if (count == 10) {
                System.out.println("ten");
            } else if (count == 15){
                System.out.println("fifteen");
                } else {
                System.out.println(count);
            }
            count++;
        }
    }// End Method

        public static void DivideByThree() {
        for (int i = 0; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }

        }
    }
}// End Class
