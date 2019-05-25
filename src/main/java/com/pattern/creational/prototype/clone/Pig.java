package com.pattern.creational.prototype.clone;

import javax.naming.Name;
import java.util.Date;

public class Pig implements Cloneable {
    private Date birthday;
    private String name;

    public Pig(Date birthday, String name) {
        this.birthday = birthday;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {


        //浅克隆
        //return super.clone();

        //深克隆
        Pig pig= (Pig) super.clone();
        pig.birthday= (Date) pig.birthday.clone();
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "birthday=" + birthday +
                ", name='" + name + '\'' +
                '}';
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
