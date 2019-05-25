package com.pattern.creational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        RedBag redBag=new RedBag();
        redBag.setMoney(10);

        for (int i=0;i<10;i++){
            // 浅拷贝
            RedBag tempRedBag= (RedBag) redBag.clone();
            tempRedBag.setRedBagId(i);
            tempRedBag.setUserId(100+i);
            RedBagUtil.sendRedBag(tempRedBag);
        }

        RedBagUtil.saveOriginRedBagMoney(redBag);





    }
}
