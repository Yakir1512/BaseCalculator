/**
 * This class represents a simple solution for Ex1.
 * As defined here: https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 * In this assignment, we will design a number formatting converter and calculator.
 * In general, we will use Strings as numbers over basis of binary till Hexa.
 * [2-16], 10-16 are represented by A,B,..G.
 * The general representation of the numbers is as a String with the following format:
 * <number><b><base> e.g., “135bA” (i.e., “135”, as 10 is the default base), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”.
 * The following are NOT in the format (not a valid number):
 * “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, "", null,
 * You should implement the following static functions:
 */

public class Ex1 {
    public static void main (String[] args){
       // System.out.println(converToTen("123" , 4) );
       // System.out.println(converToBase(converToTen("123" , 4),3));
       // System.out.println(assignments.ex1.Ex10.isNumber("1F1FbG"));
      //  System.out.println(converToBase(7967 , 16));
        System.out.println(converToBase(converToTen("1F1F" , 16),10 ));
    }


    /**
     * Convert the given number (num) to a decimal representation (as int).
     * If the given number is not in a valid format returns -1.
     * @param str a String representing a number in basis [2,16]
     * @return
     */
    public static int converToTen(String str, int base){
        int newNum = 0 , power= 0;
       // if (!isNumber(str))
         //   return -1;

        if(base < 10) {                                                                           //if the base is under 10. if the number has no chars which are not numbers. **just to do faster calculations...**
            int num = Integer.parseInt(str);
            while (num > 0) {
                int x = num % 10;
                newNum = (int) (newNum + x * (Math.pow(base, power)));
                num = num / 10;
                power++;
            }
        }
        else {
            int indx = str.length()-1 ;                                                                //this will indicate for the string index and for the power to multiply.for converting  to 10.
            while (indx >= 0) {
                if (str.charAt(indx) >= 'A') {
                    newNum = (int) (newNum + (str.charAt(indx) - 'A' + 10) * (Math.pow(base, power)));  //update the counter to itself plus the char value.
                    power++;
                    indx--;
                } else {                                                                                //if the char is a digit convert it to int and add it to counter in base 10.
                    int num = Character.getNumericValue(str.charAt(indx));
                    newNum = (int) (newNum + num * (Math.pow(base, power)));
                    power++;
                    indx--;
                }
            }
        }
        return newNum;
    }



    /**
     * This static function checks i
     * f the given String (g) is in a valid "number" format.
     * @param a a String representing a number
     * @return true iff the given String is in a number format
     */
    public static boolean isNumber(String a) {
        boolean ans = true;
        int counter =0;
        for (int i = 0; i < a.length()  ; i++ ){
            if (a.charAt(i)=='b')
                counter++;
                if (counter>1)
                    return ans = false;

        }

        String []str = a.split("b");
        String base = str[1];
        String number = str[0];
        for(int i = 0 ; i < number.length() ; i++ )
            if (number.charAt(i) < '0' || (number.charAt(i) > '9' && number.charAt(i) < 'A') || number.charAt(i) > 'G' || base.charAt(0)<number.charAt(i)) {
                ans = false;
                break;
            }

        if ( base.length() != 1  || base.charAt(0) < '2' || (base.charAt(0) >'9'&&base.charAt(0) <'A') || base.charAt(0) >'G')
            ans = false;

        return ans;
    }



    public static String converToBase(int num, int base){
        if (num<0 || base < 2 || base > 16)
            return "";
        String str = "";
        while (num > 0){
            if (num % base > 9) {
                str = str + (char)('A' + (num % base - 10));
                num = num / base;
            }
            else {
                str = str + (num % base);
                num = num / base;
            }
        }
        str=  new StringBuilder(str).reverse().toString();
        return str;
    }


    /**
     * This static function search for the array index with the largest number (in value).
     * In case there are more than one maximum - returns the first index.
     * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
     * @param arr an array of numbers
     * @return the index in the array in with the largest number (in value).
     *
     */
    public static int maxIndex(String[] arr) {
        int ans = 0;

        // add your code here

        ////////////////////
        return ans;
    }

}
