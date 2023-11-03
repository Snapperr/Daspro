package Minggu8;

import java.util.Scanner;

public class midexam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String gelar, hasil;
        
        int waktuPemecahan, bahasa, pengalaman; 

        System.out.print("Waktu untuk memecahkan permasalahan matematis kompleks (dalam menit): ");
        waktuPemecahan = sc.nextInt();

        System.out.print("Jumlah bahasa pemrograman dikuasai: ");
        bahasa= sc.nextInt();

        System.out.print("Gelar akademik (D4/S1): ");
        gelar = sc.next();

        System.out.print("Pengalaman kerja (dalam tahun): ");
        pengalaman = sc.nextInt();

        System.out.print("Hasil wawancara (Lulus/Tidak Lulus): ");
        hasil = sc.next();

        if (waktuPemecahan < 180 && bahasa >= 3 && (gelar.equalsIgnoreCase("D4") || gelar.equalsIgnoreCase("S1")) &&
                pengalaman > 1 && hasil.equalsIgnoreCase("Lulus")) {
            System.out.println("Anda diterima sebagai karyawan baru!");
        } else {
            System.out.println("Maaf, Anda tidak memenuhi kriteria perusahaan untuk penerimaan karyawan baru.");
        }
    }
}