package com.app.constell.entity;

/**
 * Created by Administrator on 17.7.27.
 */

public class WeekendLuck  extends Luck{

    /**
     * name : 水瓶座
     * weekth : 30
     * date : 2017年07月24日-2017年07月30日
     * health : 健康：本周水瓶人的健康精神压力过大的问题。 作者：星言，forseiya
     * job : 求职：本周水瓶人求职运持续走低，也会影响到你求职的兴趣。
     * love : 恋爱：本周单身的水瓶人在恋爱上会有理想上面的差异，但求同存异是关键，有伴的水瓶人会让众人感觉到十足的爱情能量。
     * money : 财运：本周水瓶人的财运赚钱会赚的有些稀里糊涂，但是会遇到不错的合作人帮你提升财运。
     * work : 工作：本周水瓶人的工作会与比较耀眼的合作人合作，让众人感觉到你的气场也是强大的。
     * resultcode : 200
     * error_code : 0
     */

    private String name;
    private int weekth;
    private String date;
    private String health;
    private String job;
    private String love;
    private String money;
    private String work;
    private String resultcode;
    private int error_code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeekth() {
        return weekth;
    }

    public void setWeekth(int weekth) {
        this.weekth = weekth;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
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
