package Minggu6;

import java.util.Scanner;
public class Selection2Exp216 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angle1, angle2, angle3, totalangle;
        int total;

        System.out.println("Input angle1: ");
        angle1=input.nextInt();
        System.out.println("Input angle2: ");
        angle2=input.nextInt();
        System.out.println("Input angle3: ");
        angle3=input.nextInt();

        totalangle = angle1+angle2+angle3;

        if(totalangle == 180)
            if(angle1==90 || angle2==90 || angle3==0)
                System.out.println("Right triangle");
            else
                System.out.println("Not a right triangle");
        else
            System.out.println("Not a triangle");
    }
}