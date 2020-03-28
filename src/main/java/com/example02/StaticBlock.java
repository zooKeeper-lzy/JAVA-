package com.example02;
//调用类的时候，静态代码块先输出，动态函数后输出
public class StaticBlock {
    public static void main(String[] args){
        TestString();
    }
    private static void TestString(){
        TestString testString=new TestString();
    }
}
