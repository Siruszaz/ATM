package Atm;

public class Test {
    public static void main(String[] args) {
        Cust cust1 = new Cust("大二", 100, "123", 10000);
        Cust cust2 = new Cust("张三", 101, "123", 5000);
        Cust cust3 = new Cust("李四", 105, "1234", 9000);
        Cust.sort(cust1, cust2, cust3);
        System.out.println("***********************");
        Cust.sum(cust1, cust2, cust3);
        cust1.saveMoney();
        System.out.println("***********************");
        cust2.getMoney();
        System.out.println("***********************");
        cust3.search();
        System.out.println("***********************");
        cust1.changePWD();
        System.out.println("***********************");
    }
}
