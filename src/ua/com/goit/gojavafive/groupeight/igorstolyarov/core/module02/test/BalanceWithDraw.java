package ua.com.goit.gojavafive.groupeight.igorstolyarov.core.module02.test;

public class BalanceWithDraw {

    public static int bool(int balance, int withdraw) {
        if (withdraw <= balance) {
            System.out.println("OK. " + "Your balance : " + (balance - withdraw));

        } else {
            System.out.println("NO. " + "Your balance : " + balance);
        }
        return balance;
    }
}
