package com.example03;


import java.util.*;

class Goods
{
    String name;
    double price;
    int num;
    public Goods()
    {

    }
    public Goods(String name,double price,int num)
    {
        this.name=name;
        this.price=price;
        this.num=num;
    }

}

class User
{
    String name;
    double rt_money;
    public User()
    {

    }
    public User(String name,double rt_money)
    {
        this.name=name;
        this.rt_money=rt_money;
    }
}

class Order
{
    User user;
    Goods[] goods;
    public Order()
    {

    }
    public Order(User user,Goods... goods)
    {
        this.goods=goods;
        this.user=user;
    }
}
class Calc
{
    static void rt_money_calc(Order order)
    {
        double sum=0;
        for(Goods i: order.goods)
        {
            sum+=i.price*i.num;
        }
        order.user.rt_money-=sum;
    }
}

public class Test
{

    public static void main(String[] args)
    {
        User user=new User("liu",99);
        Order order=new Order(user,new Goods("方便面",5.5,2),new Goods("火腿肠",2.2,4));
        Calc.rt_money_calc(order);
        System.out.println(user.rt_money);
    }
}