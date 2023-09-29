import java.util.Scanner;

public class Selection216 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);
        
        System.out.print("Nilai uas       :");
        float uas = input16.nextFloat();
        
        System.out.print("Nilai uts       :");
        float uts = input16.nextFloat();
        
        System.out.print("Nilai kuis      :");
        float kuis = input16.nextFloat();
        
        System.out.print("Nilai tugas     :");
        float tugas = input16.nextFloat();
        
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        
        String message = total < 65 ? "Retake" : "Pass";
        
        System.out.println("Final Grade = " + total + " and the decission is " + message);

        String Predikat = "";
        if (total > 80 && total <= 100){
            Predikat = "A";
        }else if (total > 73 && total <= 80){
            Predikat = "B+";
        }else if (total > 65 && total <= 73){
            Predikat = "B";
        }else if (total > 60 && total <= 65){
            Predikat = "C+";
        }else if (total > 50 && total <= 60){
            Predikat = "C";
        }else if (total > 39 && total <= 50){
            Predikat = "D";
        }else {
            Predikat = "E";
        }
        System.out.println("Predikat nilai anda " +Predikat);
    }
}