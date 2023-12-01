package Minggu14;

import java.util.Scanner;

public class ProvitRecursive16 {
    static double calculateProfit(double balance, int period) {
        if (period == 0)
            return balance;
        else
            return 1.11*calculateProfit(balance, period-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input balance : ");
        double initialbalance = sc.nextInt();

        System.out.print("Input Investment Period : ");
        int investPeriod = sc.nextInt();

        System.out.println("Balance after "+investPeriod+" year = "+calculateProfit(100000, 3));
    }
}
