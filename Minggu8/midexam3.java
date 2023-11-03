package Minggu8;

import java.util.Scanner;

public class midexam3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;

        System.out.print("Masukkan bilangan bulat N (N > 0): ");
        angka = input.nextInt();

        if (angka <= 0) {
            System.out.println("N harus lebih dari 0.");
        } else {
            int bilangangenap = 0;
            
            while (angka > 0) {
                int jumlah = angka % 10;
                if (jumlah % 2 == 0) {
                    bilangangenap++;
                }
                angka /= 10;
            }
            System.out.println("Jumlah digit yang genap = " + bilangangenap);
        }
        input.close();
    }
}
