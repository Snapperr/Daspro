package Minggu14;

import java.util.Scanner;

public class DescendingSequance {
    public static void main(String[] args) {
        
        DescendingSequanceRecursive(5);
        System.out.println();
        DescendingSequanceInterative(5);
    }

    static void DescendingSequanceRecursive(int n) {
        if ( n == 0) {
            System.out.println("0\n");
        } else {
            System.out.println(n + " ");
            DescendingSequanceRecursive(n-1);
        }
    }

    static void DescendingSequanceInterative(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i + " ");
        }
    }
}