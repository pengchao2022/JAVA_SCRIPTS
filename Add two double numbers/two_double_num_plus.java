
// this program is to calculate two double numbers plus
// written by pengchao in Shanghai 

import java.util.Scanner;

public class two_duble_num_plus {
    public static void main(String[] args) {
        System.out.println("*************************************************");
        System.out.println("Please type two double numbers here:");
        System.out.println("*************************************************");

        Scanner in = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        double sum = 0;

        System.out.print("Please type your first numebr here:");
        num1 = in.nextDouble();
        System.out.print("Please type your second number here:");
        num2 = in.nextDouble();

        sum = num1 + num2;

        System.out.println(sum);

    }
    
}
