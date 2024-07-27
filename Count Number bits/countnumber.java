

//This program is when you type a number and the computer will give you how many bit the number has

// For example, 2 is 1 bit and 300 is 3 bit and 1000 is 4 bit

// this program is written be pengchao in Shanghai

import java.util.Scanner;

public class countnumber {
    public static void main(String[] args) {

        System.out.println(" Please type your number here:");

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int count = 0;
        while (number > 0) {

            number = number / 10;
            count += 1;
            System.out.println("number="+ number + "  count is:"+ count);

            
        }

        System.out.println("The number you typed bits is:"+ count);

        
    }
}
