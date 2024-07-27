


// this program is to calculate the salary when work hours over than 8 hours

// written by pengchao in shanghai

import java.util.Scanner;

public class salarypay {
    public static void main(String[] args) {
        final double RATE = 8.25;
        final int STANDARD = 40;
        double pay = 0.0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of hours worked here:");

        int hours = in.nextInt();

        if (hours > STANDARD) {

            pay = STANDARD*RATE + (hours - STANDARD)*(RATE*1.5);
            
        }
        else{

            pay = hours*RATE;
        }

        System.out.println("Greetings,your pay is: " + pay);
    }
}
