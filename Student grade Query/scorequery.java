
// this program is to query grade for students
// this program is written by pengchao in Shanghai

import java.util.Scanner;

public class gradequery {
    public static void main(String[] args) {

       
        while (true) {
            final int PASS = 60;
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your grade here:");
            int score = scan.nextInt();
            System.out.println("your score is: " + score);

            if(score < PASS){
                System.out.println("Sorry,You are not qualified!");

            }
            else{
                System.out.println("greetings, You score is OKay");
                System.out.println("Bye Bye");
            }
        }
        
    }
}
