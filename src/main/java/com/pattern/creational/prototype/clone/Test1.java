package com.pattern.creational.prototype.clone;

import com.pattern.creational.singleton.HungrySingleton;

import javax.sound.midi.Soundbank;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test1 {

    //克隆破坏单例模式

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HungrySingleton hungrySingleton=HungrySingleton.getInstance();

        //反射获取clone方法
        Method method=hungrySingleton.getClass().getDeclaredMethod("clone");

        //因为在HungrySingleton中clone的权限修饰符是protected的。
        method.setAccessible(true);

        HungrySingleton clonehungrySingleton= (HungrySingleton) method.invoke(hungrySingleton);
        System.out.println(hungrySingleton);
        System.out.println(clonehungrySingleton);
    }
}
