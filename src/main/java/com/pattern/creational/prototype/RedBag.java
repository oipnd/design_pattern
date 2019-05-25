package com.pattern.creational.prototype;

public class RedBag implements Cloneable{
    private int redBagId;
    private double money;
    private int userId;

    public RedBag(){
        System.out.println("RedBag class construct");
    }
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        //如果需要对各个属性进行深拷贝，则对每个方法也重写clone方法
        System.out.println("clone redBag");
        return super.clone();
    }

    @Override
    public String toString() {
        return "RedBag{" +
                "redBagId=" + redBagId +
                ", money=" + money +
                ", userId='" + userId + '\'' +
                '}';
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getRedBagId() {
        return redBagId;
    }

    public void setRedBagId(int redBagId) {
        this.redBagId = redBagId;
    }
}
