package com.principle.dependenceinversion;

public class Test {
    public static void main(String[] args) {

        //v1 test的实现需要依赖于Xiaoming的实现，即高层的实体类此时依赖于底层的类。
        //XiaoMing xiaoMing =new XiaoMing();
        //xiaoMing.studyCourse1();
        //xiaoMing.studyCourse2();

        //v2 通过接口方法的方式注入具体实现，此时实现类不需要具体属性
        //XiaoMing xiaoMing=new XiaoMing();
        //xiaoMing.study(new JavaCourse());
        //xiaoMing.study(new GoCourse());


        //v3 通过构造器方法注入,缺点是只能注入一次，相当于单例模式。
        //XiaoMing xiaoMing=new XiaoMing(new JavaCourse());
        //xiaoMing.study();

        //v4 v3的修改，可以通过setter实现注入
        XiaoMing xiaoMing = new XiaoMing();
        xiaoMing.setIcourse(new JavaCourse());
        xiaoMing.study();
        xiaoMing.setIcourse(new GoCourse());
        xiaoMing.study();
    }

}
