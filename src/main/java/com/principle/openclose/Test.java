package com.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse GolangCourse1 = new GolangDiscoutCourse("das ", 123123, 1231);
        GolangDiscoutCourse GolangCourse = (GolangDiscoutCourse) GolangCourse1;
        System.out.println(GolangCourse.getPrice());
        System.out.println(GolangCourse.getID());
        System.out.println(GolangCourse.getName());
        System.out.println(GolangCourse.getOriginPrice());

    }
}
