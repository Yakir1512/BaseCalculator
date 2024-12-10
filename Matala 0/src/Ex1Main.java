
import java.util.Scanner;

/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    public static void main(String[] args) {
        int base , base1 ,base2;
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
                            base = assignments.ex1.Ex10.inputBase(stbase); //convert the base to int.
                        else {                                             //if the input base isnt valid.
                            System.out.println("Base is not valid to me!!!" + " Try again");
                            continue;
                        }
                        base1 = assignments.ex1.Ex10.theNumberBase(num1);
                        base2 = assignments.ex1.Ex10.theNumberBase(num2);

                        String []str = num1.split("b");            //splitting the string for tow and check if valid.
                        String []str2 = num2.split("b");
                        String number = str[0];
                        String number2 = str2[0];


                        System.out.println("the first converted number is- "+num1+" in base "+base1+ " and it converted to: "+assignments.ex1.Ex10.converToBase(assignments.ex1.Ex10.converToTen(num1,base1),base));
                        System.out.println("the second converted number is-"+num2+" in base "+base2+" and it converted to: "+assignments.ex1.Ex10.converToBase(assignments.ex1.Ex10.converToTen(num2,base2),base));
                        System.out.println("Max index in-"+ num1+" is: "+ assignments.ex1.Ex10.maxIndex(str));
                        System.out.println("Max index in-"+ num2+" is: "+ assignments.ex1.Ex10.maxIndex(str2));
                        System.out.println("are equals? "+ assignments.ex1.Ex10.equals(number,number2));
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
