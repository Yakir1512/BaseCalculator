
import java.util.Scanner;

/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    public static void main(String[] args) {
        int base;
        String stbase;
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2="", quit = "quit";
        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();

            if (!num1.equals("quit")) {
                if(assignments.ex1.Ex10.isNumber(num1))
                    System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
                else{
                    continue;
                }
                    num2 = sc.next();
                if (!num2.equals("quit")){
                    if (assignments.ex1.Ex10.isNumber(num2)){
                        System.out.println("Type the base you want to convert to? [2,16]. Enter A-G for Base 10-16!");
                        stbase = sc.next();
                        //convert the string base to int.
                        if (!(stbase.length() > 1))
                        if (stbase.charAt(0) > 57 ){
                            base = (stbase.charAt(0)- 65) +10;
                        }
                        else {
                            base = (stbase.charAt(0)-48);
                        }
                        else {
                            System.out.println("Base is not valid to me!!!" + " Try again");
                            continue;
                        }
                        assignments.ex1.Ex10.converToBase(assignments.ex1.Ex10.converToTen(num1),base);
                        assignments.ex1.Ex10.converToBase(assignments.ex1.Ex10.converToTen(num2),base);
                    }
                    else{
                        continue;
                    }
                }

            }
        }
        System.out.println("quiting now...");
    }
}
