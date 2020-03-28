package com.example01;

public class Bicycle {
    private int speed;
    private int gear;
    private int candence;
    private static int amount=0;
    private boolean moving;
    public Bicycle(){}
    public Bicycle(int gear){
        this.gear=gear;
    }

    public static int getAmount() {
        return amount;
    }

    public Bicycle(int gear, int candence){
        this.gear=gear;
        this.candence=candence;
    }
    public Bicycle(int gear,int candence,int speed){
        amount++;
        this.gear=gear;
        this.candence=candence;
        this.speed=speed;
    }
    public Bicycle(int gear,int candence,int speed,boolean moving){

        this.gear=gear;
        this.candence=candence;
        this.speed=speed;
        this.moving=moving;
    }
//    public setSpeed(){
//
//    }

}
