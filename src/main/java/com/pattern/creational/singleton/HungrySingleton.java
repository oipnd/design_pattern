package com.pattern.creational.singleton;

public class HungrySingleton implements Cloneable{

    //fianl 和static关键字来使类加载就完成了实例化
    private final static HungrySingleton HUNGRY_SINGLETON=new HungrySingleton();

    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        //不安全的clone方法，会破坏单例模式
        //return super.clone();
        //安全的
        return getInstance();
    }
}
