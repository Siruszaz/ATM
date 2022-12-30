package Atm;

import java.util.Scanner;

public class Cust {
    private String name;
    private int id;
    private String pwd;
    private int money;
    private int selfNum;
    static String bankName = "建设银行";
    static int allNum = 0;

    public Cust(String name, int id, String pwd, int money) {
        this.name = name;
        this.id = id;
        this.pwd = pwd;
        this.money = money;
        this.selfNum = allNum;
        allNum++;
    }

    void getMoney() {
        System.out.println("请输入取款金额：");
        Scanner reader = new Scanner(System.in);
        int mon = reader.nextInt();
        if (mon < money) {
            System.out.println("取款成功！");
            money -= mon;
        } else {
            System.out.println("余额不足");

        }

    }

    public void saveMoney() {
        System.out.println("请输入存款金额：");
        Scanner reader = new Scanner(System.in);
        int mon = reader.nextInt();
        money += mon;
        System.out.println("存款成功！一共有" + money + "元");
    }

    public void search() {
        System.out.println("所属银行" + bankName);
        System.out.println("你是本行" + allNum + "个顾客中的第" + selfNum + "个顾客");
        System.out.println("用户姓名：" + name);
        System.out.println("用户账号：" + id);
        System.out.println("用户余额：" + money);
    }

    public void changePWD() {
        System.out.println("请输入新密码");
        Scanner reader = new Scanner(System.in);
        String pw = reader.next();
        if (pw == pwd) {
            System.out.println("与原密码相同");
        } else {
            pwd = pw;
            System.out.println("修改成功");
        }

    }

    public static double sum(Cust... c) {
        double sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += c[i].money;
        }
        return sum;
    }

    public static void sort(Cust... c) {
        Cust temp;
        for (int j = 0; j < c.length - 1; j++) {
            for (int i = 0; i < c.length - j - 1; i++) {
                if (c[i].money < c[i + 1].money) {
                    temp = c[i];
                    c[i] = c[i + 1];
                    c[i + 1] = temp;
                }
            }
        }
        for (int j = 0; j < c.length; j++) {
            System.out.println(c[j].name + ", " + c[j].id +
                    ", " + c[j].money);
        }

    }
}
