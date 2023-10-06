package Minggu6;

import java.util.Scanner;

public class Selection2Exp116 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        System.out.println("Input year: ");
        year = input.nextInt();

        if(year%4 == 0)
            if(year%200 != 0){
                System.out.println("Leap year");
            }else {
                System.out.println("Not a leap year");
          }else {
            System.out.println("Not a leap year");
        }
    }
}       