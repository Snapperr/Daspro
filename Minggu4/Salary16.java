package Minggu4;

import java.util.Scanner;

public class Salary16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numAttendance, numAbsence, totalSalary;
        int Salary=40000, SalaryDeduction=25000;

        System.out.println("Input attendance number:    ");
        numAttendance = input.nextInt();
        System.out.println("Input absence number:   ");
        numAbsence = input.nextInt();

        totalSalary=(numAttendance*Salary)-(numAbsence*SalaryDeduction);

        System.out.println("Total salary:   "+totalSalary);
    }
}
