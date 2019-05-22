package com.principle.dependenceinversion;

public class XiaoMing {

    //v1 此时是面向实现编程，实现类需要经常修改，扩展性极差。
    //public  void studyCourse1(){
    //    System.out.println("study course1");
    //}
    //public  void studyCourse2(){
    //    System.out.println("study course2");
    //}

    //v2

    //public XiaoMing(Icourse icourse) {
    //    this.icourse = icourse;
    //}
    //public void study(Icourse icourse){
    //    icourse.studyCourse();
    //}

    //v3
    //private Icourse icourse;

    //public XiaoMing(Icourse icourse) {
    //    this.icourse = icourse;
    //}

    //public void study(){
    //    icourse.studyCourse();
    //}


    //v4
    private Icourse icourse;


    public void setIcourse(Icourse icourse) {
        this.icourse = icourse;
    }

    public void study(){
        icourse.studyCourse();
    }


}
