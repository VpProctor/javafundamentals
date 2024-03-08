package com.fundamentals.lessons;

public class Lesson9 {




























    /*Enhanced for loop or foreach loop*/
    public void enhancedForLoop() {
        int[] intArray = { 23,45,4,12,92,103,37};
        for(int number : intArray) {
            System.out.println(number);
        }// end loop
    }// End method

    /*Two-Dimensional Array */
    public void aTwoDimensionalArray() {
        int[][] myArray = {{23,45} , {35, 46},
                {57, 98} , {32,48}};
        for(int i = 0; i <myArray.length; i++) {
            for(int j = 0; j < myArray[i].length;j++) {
                //System.out.println("[" +i+ "]"+"["+j+"]" = " + "+ myArray[i][j]);
                //System.out.println(myArray[i][0]) +
                      //  " " + myArray[i][1]);
            }// end inner loop
        }// end outer lop
    } //end method
    /* Enhanced for loop 2D Array */
    public static void main(String[] args) {
        int [][] otherArray = {{32,54} ,{53,64} ,
                {75,89} , {23, 84}};
        for(int[] ints : otherArray) {
            for(int anInt : ints) {
                System.out.print(anInt +" ,");
            } //end inner loop
        } //end outer for loop

    }// endd method

        /*Three - dimensional*/
    public void aThreeDArray() {
        int [][][] threeD = {
                {{10, 11}, {12,13}},
                {{14, 15}, {16,17}}
        };
        for(int a = 0; a< threeD.length; a++) {
           // for(int b = 0 < threeD[b]).length; c++)}






    }






    //public static void main(String[] args){
        Lesson9 myLesson = new Lesson9();
        //myLesson basicIntArray();
        //myLesson
    }

}
