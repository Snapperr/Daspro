package Minggu8;

public class midexam2 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 99; i++) {
            System.out.print(i + ".0 + " + (i + 1.5)+ " + ");
            sum += i + ( i + 1.5);
        }
        System.out.println("99.0 = " + (sum + 99));
    }
}