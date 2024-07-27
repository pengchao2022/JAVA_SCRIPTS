
// this program is to compare two numbers you input and print the max one

// Written by pengchao in Shanghai

import java.util.Scanner;


public class comparenumbers {
    public static void main(String[] args) {

        System.out.println("**************************************************");
        System.out.println("This program  is to compare two numbers");
        System.out.println("***************************************************");

        Scanner in = new Scanner(System.in);

        int num1=0, num2=0;
        System.out.println("Please type your first number here:");

       
        num1 = in.nextInt();

        System.out.println("Please type your second number here:");

        num2 = in.nextInt();

        if(num1 < num2)
            System.out.println("max= "+ num2);
        
        else if (num1 == num2) {

            System.out.println(num1 + "=" + num2);
            
        }
            





        
    }
}
