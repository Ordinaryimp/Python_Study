package com.eleven;

/**
 * ClassName:Account
 * Package:com.eleven
 * Description:
 *
 * 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”
 * 定义封装这些属性的方法.账号要自动生成.
 *
 * @Author mzy
 * @Create 2024/11/15 15:00
 * @Version 1.0
 */
public class Account {
    private int id;//账号
    private String password;//密码
    private double balance;//余额
    private static double interestRate;//利率
    private static double minBalance = 1.0;//最小余额
    private static int init = 1001;//用于自动生成id的基数

    public Account(){
        this.id = init++;
        password = "000000";
    }
    public Account(String password, double balance) {
        this();
        this.password = password;
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }
}
