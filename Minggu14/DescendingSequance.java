package Minggu14;

public class DescendingSequance {
    public static void main(String[] args) {

        DescendingSequanceRecursive(5);
        System.out.println();
        DescendingSequanceInterative(5);
    }

    static void DescendingSequanceRecursive(int n) {
        if (n == 0) {
            System.out.print("0\n");
        } else {
            System.out.print(n + " ");
            DescendingSequanceRecursive(3);
        }
    }

    static void DescendingSequanceInterative (int n) {
        for ( int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
 }
