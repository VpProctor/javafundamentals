package com.fundamentals.labs;
import java.util.Scanner;
import java.sql.SQLOutput;

public class OperatorsLab {
   //Task 1
    public static void main(String[] args) {
        //MAth Problems with variables
    int answer1 = 10 + 32 * 12 / 3;
    int answer2 = 10 + (32 * 12) /3;

    System.out.println ("answer 1: " + answer1);
    System.out.println ("total 2: " + answer2) ;  }

    //Task 2
    public static void applyOperators(int num1, int num2) {
    }
    public static void main(int [] args){
        int num1 = 15;
        int num2 = 25;

        applyOperators(num1,num2);
    }
    public static void OpperatorsApplied(int num1, int num2) {
        //+=
        num1 += num2;
        System.out.println("+= operator answer: " + num1);

        //*=
        num1 *= num2;
        System.out.println("*= operator answer:" +num1);

        //%=
        num1 %= num2;
        System.out.println("%= operator answer: " + num1);

    }
    public static class calculateModulus{
        public static void main(String [] args) {
            int modulusAnswer = ModulusTotal();
            System.out.println("Modulus answer:" + modulusAnswer);
        }
        public static int ModulusTotal() {
            int numberVariable = 20;
            Scanner scanner = new Scanner(System.in);
            System.out.print("100:");
            int useNumber = scanner.nextInt();

            int modulusNumber = useNumber % numberVariable;
            scanner.close();
            return modulusNumber;
        }
    }


}//End Class
