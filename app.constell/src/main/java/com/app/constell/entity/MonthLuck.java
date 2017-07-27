package com.app.constell.entity;

/**
 * Created by Administrator on 17.7.27.
 */

public class MonthLuck  extends Luck{

    /**
     * date : 2017年07月
     * name : 水瓶座
     * month : 7
     * all : 金星进入恋爱宫，桃花运旺。上半月，工作繁忙，很多杂事儿需要处理。下半月，伴侣关系、合作关系或者敌对关系是你关注的焦点。

     * health : 注意保护胃肠健康。
     * love : 单身的人，在老朋友的聚会活动中，可能遇到聊的来的人。有伴的人，对另一半更为关注。

     * money : 财运来自于对自己的不断提升。

     * work : 长途旅行机会变多，或者是出差，或者是与老客户商谈新合作。

     * happyMagic :
     * resultcode : 200
     * error_code : 0
     */

    private String date;
    private String name;
    private int month;
    private String all;
    private String health;
    private String love;
    private String money;
    private String work;
    private String happyMagic;
    private String resultcode;
    private int error_code;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getHappyMagic() {
        return happyMagic;
    }

    public void setHappyMagic(String happyMagic) {
        this.happyMagic = happyMagic;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }
}
