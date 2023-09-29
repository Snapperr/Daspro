import java.util.Scanner;

public class Selection116 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);

        //System.out.println("Input a number");
        //int number = input16.nextInt();

        //if (number%2 == 0);{16
            //System.out.println(number+" is an even number!");
        //}else{
            //System.out.println(number+" is an odd number!");
        //}
        
        System.out.print("Input a number");
        int number = input16.nextInt();
        String output = (number%2 == 0) ? number+"is an even number!" : number+" is an odd number!";
        System.out.println(output);
    }
}