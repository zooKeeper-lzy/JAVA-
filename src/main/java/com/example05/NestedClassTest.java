package com.example05;

public class NestedClassTest {
    public static void main(String[] args) {
        testNestedClass();

    }

    private static void testNestedClass() {
        person.IQ iq = new person.IQ(250);
        person person = new person("BO", iq);
        System.out.println(person.getIq().getPoint());

    }
}