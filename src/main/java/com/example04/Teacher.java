package com.example04;

public class Teacher {
    private int number;
    private String name;
    public Teacher(int number,String name){
        this.name=name;
        this.number=number;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int nubmer){
        this.number=number;
    }
    public String getName(){
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}
