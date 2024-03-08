package com.fundamentals.main;

public class Boat {
    private int boatSize;
    private String  boatColor;
    private String rudderType;
    private int deckSize;

    public Boat () {
        boatSize = 6;
        boatColor = "Blue";
        rudderType = "Full Rudder";
        deckSize = 30;

    }
    public Boat(String boatColor, int boatSize ,
                 int deckSize , String rudderType) {
        this.boatColor = boatColor;
        this.boatSize = boatSize;
        this.rudderType = rudderType;
        this.deckSize = deckSize;
    }

    public String getBoatColor() {
       return boatColor;
    }

    public int getBoatSize() {
        return boatSize;
    }
    public String getRudderType() {
        return rudderType;
    }

    public int getDeckSize() {
        return deckSize;
    }





    public static void main(String []args){
    Boat myboat = new Boat();
    System.out.println(("boatColor"));
    }



} // end class
