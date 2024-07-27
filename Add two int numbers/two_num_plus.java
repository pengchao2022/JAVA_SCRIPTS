
// this program is to input two integer numbers
// and calculate the sum of numbers

import java.util.Scanner;

public class two_num_plus {
    public static void main(String[] args) {
        System.out.println("****************************************");
        System.out.println("This program is for two int numbers sum");
        System.out.println("****************************************");
        Scanner in = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        System.out.print("Please type your first integer number here:");
        num1 = in.nextInt();

        System.out.print("Please type your second integer number here:");
        num2 = in.nextInt();

        sum = num1 + num2;

        System.out.println(num1 + "+" +num2 + "="+ sum);

        System.out.println(sum);

    }




}
