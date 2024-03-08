package com.fundamentals.main;

public class SailBoat extends Boat {
    public int sailSize;

    public SailBoat (String boatColor) {
        this(boatColor,6, "Full Rudder", 30, 70);
    }
    public SailBoat(String boatColor, int boatSize,
                     String rudderType, int deckSize, int sailSize) {
        super(boatColor, boatSize,deckSize, rudderType);
        this.sailSize= sailSize;
    }

    public int getSailSize() {
        return sailSize;
    }

public static void main(String[] args) {
        SailBoat mysailboat = new SailBoat("boatSize");
    System.out.println(mysailboat.getBoatColor());
    System.out.println(mysailboat.getBoatSize());
}
}// end Class
