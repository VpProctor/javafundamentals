package com.fundamentals.labs;

public class StringLab {
    public void StringPractice(String String){
        System.out.println(String.toLowerCase());
        System.out.println(String.charAt(3));
        System.out.println(String.length());

    }

    public static void main (String[] args) {
        StringLab myStringLab = new StringLab();
        String msg = " Jack and Jill";
        System.out.println("Jack and Jill went up the hill");
        System.out.println("to fetch a pail of water.");
        System.out.println("Jack fell down and broke his crown");
        System.out.println("and Jill came tumbling after");
    }
}// End Class
