package com.pattern.creational.prototype;


import java.text.MessageFormat;

public class RedBagUtil
{
    public static void sendRedBag(RedBag redBag){
        String assignmentOutput="用户{0}收到金额为{1}的红包，该红包id为{2}";
        System.out.println(MessageFormat.format(assignmentOutput, redBag.getUserId(), redBag.getMoney(), redBag.getRedBagId()));
    }

    public static void saveOriginRedBagMoney(RedBag redBag){
        System.out.println("存储origin红包记录，originRedBag的金额为："+redBag.getMoney());
    }
}
