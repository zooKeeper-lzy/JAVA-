package com.example01;

public class Student {
    //创建一个与学生类相关的性别常量，只和类相关，与类的具体对象无关
    public static final String MALE="male";
    public static final String FEMALE="female";
    private int nefuNumber;
    private String name;
    private boolean lzay;
    private String sex;
    public Student(int nefuNumber, String name, boolean lzay,String sex) {
        this.sex=sex;
    this.nefuNumber=nefuNumber;
    this.name=name;
    this.lzay=lzay;
    }
    //为外界可以调用该属性,返回值，所以要标注值的类型
    public int getNefuNumber(){
        return nefuNumber;
    }
    //为外界可以修改该属性，不返回一个值，所以用void占位
    public void setNefuNumber(int nefuNumber) {
        this.nefuNumber=nefuNumber;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public boolean getLzay(){
        return lzay;
    }
    public void setLzay(boolean lazy){
        this.lzay=lzay;
    }
}