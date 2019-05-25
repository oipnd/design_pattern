package com.pattern.creational.prototype.clone;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1=new Pig(birthday,"xjl");
        Pig pig2= (Pig) pig1.clone();


        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(5454564654666L);

        System.out.println(pig1);
        System.out.println(pig2);
    }
}
