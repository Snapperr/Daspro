package Minggu13;

import java.util.Scanner;

public class Experiment6_16 {
    static int calculateArea (int l, int w) {
        int area = 1*w;
        return area;
    }
    static int calculateVolume (int l, int w, int h) {
        int vol = calculateArea(l, w) *h;
        return vol;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int p, l, t, L, vol;

        System.out.print("Input length = ");
        p = sc.nextInt();

        System.out.print("Input width = ");
        l = sc.nextInt();

        System.out.print("Input height = ");
        t = sc.nextInt();

        L = calculateArea(p, l);
        System.out.println("Area of the rectangle = "+ L);

        vol = calculateVolume(t, p, l);
        System.out.println("Volume of the rectangle = "+vol);
    }
}