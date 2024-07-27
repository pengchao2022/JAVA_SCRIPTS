
// this program is to translate the inch to miles 

// the program is written be pengchao in Shanghai

import java.util.Scanner;

public class inch_to_mile {
    public static void main(String[] args) {

        System.out.println("***********************************************************");
        System.out.println("This program is asked you to input inch and foot ");
        System.out.println("**************************************************************");
        
        Scanner in = new Scanner(System.in);

        int foot;
        double inch;
        
        System.out.print("Please type your foot here:");
        foot = in.nextInt();

        System.out.print("Pelse type your inch here:");
        inch = in.nextDouble();

        System.out.println((foot + inch/12.0)*0.3048);

        

        
    }
}
