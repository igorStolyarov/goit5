package ua.com.goit.gojavafive.groupten.igorstolyarov.core.module02.homeWork.hw022;

public class BalanceWithDraw {

    static String okStr = "OK. Commission: ";
    static String balStr = " Your balance: ";
    static String noStr = "No. Your withdraw request exceeds your balance. ";

    public static double bal(double balance, double withdraw) {

        double commission = withdraw * 0.05;
        double finallyWithdraw = withdraw + commission;

        if (finallyWithdraw <= balance) {
            System.out.println(okStr + commission + balStr + (balance - finallyWithdraw));
        } else {
            System.out.println(noStr + balStr + balance);
        }
        return balance;
    }
}
