package com.fundamentals.main;

import com.fundamentals.practice.HousePhone;
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello Java");
       // houseExample();
    }


    // Single Comment
    /*Multi-line comment
    This is a second line
    And a third.
    * */

    public static void basicStatemnts(){
       // basicStatement rgf nts myStatement = new statement();
    }
    public static void houseExample() {
        House myHouse = new House("Concrete","Red",
             "Cedar Shingle", 30);
        myHouse.doorFunction ();
       // System.out.println(myHouse.entranceDoorColor());
    }
    // import com.fundamentals.practice.HousePhone
    public static void phoneExample() {
        int[] keys ={0,1,2,3,4,5,6,7,8,9};
        HousePhone mytelephone = new HousePhone(7,keys,
                0, "LCD");
        mytelephone.sendCall();
    }
}
