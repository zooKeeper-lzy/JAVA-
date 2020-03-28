package com.example01;

public class ConstructorTest {
    public static  void main(String[] args){
        //声明一个Student类型的student变量，用new来为变量分配内存，并返回该内存中的引用来实例化
        //一个类，调用函数来完成对象的初始化。
        //直接通过类调用而非对象调用
    Student student1=new Student(2018214422,"lzy",false,Student.FEMALE);
    student1.setName("zyq");
    System.out.println(student1.getNefuNumber());    System.out.println(student1.getName());
    System.out.println(student1.getLzay());
    System.out.println(student1.getSex());
    int speed=10;
    Bicycle bicycle=new Bicycle(10,90,10);
    System.out.println(Bicycle.getAmount());

    }
}
