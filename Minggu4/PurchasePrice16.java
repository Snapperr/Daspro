package Minggu4;

import java.util.Scanner;

public class PurchasePrice16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int price, quantity;
        double discount=0.1, totalPrice, purchasePrice, totalDiscount;

        System.out.println("Input price: ");
        price=input.nextInt();
        System.out.println("Input quantity: ");
        quantity=input.nextInt();

        totalPrice=price*quantity;
        totalDiscount=totalPrice*discount;
        purchasePrice=totalPrice-totalDiscount;

        System.out.println("Total discount: " +totalDiscount);
        System.out.println("Final puchase price: " +purchasePrice);
    }
}
