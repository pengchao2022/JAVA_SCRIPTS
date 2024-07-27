

// this program is for subway ticket auto system
// this program is written by pengchao in Shanghai

import java.util.Scanner;

public class ticketsys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int balance = 0;

        while (true) {

            System.out.println("Please insert your coins here:");
            int amount = in.nextInt();
            balance = balance + amount;
            if(balance >= 10){

                System.out.println("****************************************");
                System.out.println("***** New York Subway Ticket System *****");
                System.out.println("***** ********Level 2 Seat ***************");
                System.out.println("********* PRICE 10 DALLORS ***************");
                System.out.println("******************************************");

                System.out.println("Money to you is: " + (balance - 10));
                balance = 0;



            }
            
        }
        


    }
}
