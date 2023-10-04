package ProjectOnlineTicket;

import java.util.Scanner;

public class ticketvip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double PriceTicketVIP = 300;
        int NumberofTicket;

        System.out.println("Input ticket vip: ");
        NumberofTicket = input.nextInt();

        PriceTicketVIP = PriceTicketVIP * NumberofTicket;
        System.out.println("Price Ticket VIP " +PriceTicketVIP);
    }
}