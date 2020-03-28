package com.example06.eumtype;

public class EnumTest {
    public static void main(String[] args){
        //不限制输入
        System.out.println(getSeason("Spring"));
        //使用枚举类型，限制了输入
        System.out.println(getSeason2(Season.SUMMER));
    }
    //设置一个枚举类型Season
    private static String getSeason2(Season season){
    String msg="";
    switch(season){
        case SPRING:
            msg = "花儿盛开了";
            break;
        case SUMMER:
            msg = "我想要吃西瓜🍉";
            break;
        case AUTUMN:
            msg = "是个丰收的好季节";
            break;
        case WINTER:
            msg = "我想去滑雪";
            break;

    }
    return msg;
    }
    private  static String getSeason(String season) {
        String msg = "";
        switch (season) {
            case "Spring":
                msg = "花儿盛开了";
                break;
            case "Summer":
                msg = "我想要吃西瓜🍉";
                break;
            case "Autumn":
                msg = "是个丰收的好季节";
                break;
            case "Winter":
                msg = "我想去滑雪";
                break;
        }
        return msg;
    }

}
