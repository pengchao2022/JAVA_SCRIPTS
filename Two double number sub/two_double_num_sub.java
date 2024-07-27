
// This program is for two double number subtraction

// Written by pengchao in Shanghai

import java.math.BigDecimal;
import java.util.Scanner;

public class two_double_num_sub {

    public static void main(String[] args) {
        System.out.println("****************************************************");
        System.out.println("Plese type two double nubers for substraction");
        System.out.println("****************************************************");

        Scanner in = new Scanner(System.in);
         
        System.out.println("Pelsae type your second nunber here:");
        BigDecimal num1 = in.nextBigDecimal();
        System.out.println("Please type your first number here:");
        BigDecimal num2 = in.nextBigDecimal();

       

        System.out.println("The result of first sub second is:");
        System.out.println(num1.subtract(num2));
    }

    
    
}
