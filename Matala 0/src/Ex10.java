package assignments.ex1;
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

public class Ex10 {

       public static int converToTen(String str , int base){
           int newNum = 0 , power= 0;
           if (!isNumber(str))
               return -1;

           String []a = str.split("b");
           String number = a[0];

           if(base < 10) {                                                                           //if the base is under 10. if the number has no chars which are not numbers. **just to do faster calculations...**
               int num = Integer.parseInt(number);
               while (num > 0) {
                   int x = num % 10;
                   newNum = (int) (newNum + x * (Math.pow(base, power)));
                   num = num / 10;
                   power++;
               }
           }
           else {
               int indx = (number.length()-1) ;                                                                //this will indicate for the string index and for the power to multiply.for converting  to 10.
               while (indx >= 0) {
                   if (number.charAt(indx) >= 'A') {
                       newNum = (int) (newNum + (number.charAt(indx) - 'A' + 10) * (Math.pow(base, power)));  //update the counter to itself plus the char value.
                       power++;
                       indx--;
                   } else {                                                                                //if the char is a digit convert it to int and add it to counter in base 10.
                       int num = Character.getNumericValue(number.charAt(indx));
                       newNum = (int) (newNum + num * (Math.pow(base, power)));
                       power++;
                       indx--;
                   }
               }
           }
           return newNum;
       }
        /**
         * Convert the given number (num) to a decimal representation (as int).
         * If the given number is not in a valid format returns -1.
         * @param num a String representing a number in basis [2,16]
         * @return
         */
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



        public static int theNumberBase(String str){
            int ans;
            String []a = str.split("b");
            String baseNum2 = a[1];

            if (baseNum2.charAt(0) > 57){
                ans = (baseNum2.charAt(0)-65)+10;
            }

            else {
                ans = Integer.parseInt(baseNum2);
            }
            return ans;
        }

        public static int inputBase(String str){
            int ans;
            if (str.charAt(0) > 57){
                ans = (str.charAt(0)-65)+10;
            }

            else {
                ans = Integer.parseInt(str);
            }
            return ans;
        }

        /**
         * This static function checks if the given String (g) is in a valid "number" format.
         * @param a a String representing a number
         * @return true iff the given String is in a number format
         */
        public static boolean isNumber(String a) {
            boolean ans = true;

            if (!a.contains("b"))
                return ans=false;

            if (a.length()>1){
            String []str = a.split("b");            //splitting the string for tow and check if valid.
            String base = str[1];
            String number = str[0];

            for(int i = 0 ; i < number.length() ; i++ )     //if the number is valid.
                if (number.charAt(i) < '0' || (number.charAt(i) > '9' && number.charAt(i) < 'A') || number.charAt(i) > 'G' || number.charAt(i)>base.charAt(0))
                ans = false;

            if ( base.length() != 1  || base.charAt(0) < '2' || (base.charAt(0) >'9'&&base.charAt(0) <'A') || base.charAt(0) >'G')      //if the base is valid.
                ans = false;

            return ans;
        }
            return ans=false;
        }



        /**
         * Checks if the two numbers have the same value.
         * @param n1 first number
         * @param n2 second number
         * @return true iff the two numbers have the same values.
         */
        public static boolean equals(String n1, String n2) {
            boolean ans = true;
            if(n1.length() != n2.length())
                return false;
            for ( int i = 0; i < n1.length() ; i++){
                if (n1.charAt(i)!=n2.charAt(i))
                    return false;
            }
            return ans;
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
            int ans , temp;
            String s="";
            s = s+arr[0];

            if (s.charAt(0) > 57) {
                ans = (s.charAt(0) - 65) + 10;
            }
            else {
                ans = Integer.parseInt(s.substring(0,1));
            }
            if (s.length()==1)
                return ans;

            for(int j = 0; s.length()>j+1;j++) {

                if (s.charAt(0) > 57){
                    temp = (s.charAt(j)-65)+10;
                }

                else {
                    temp = Integer.parseInt(String.valueOf(s.charAt(j+1)));
                }
                if (temp>ans)
                    ans = temp;

            }


            return ans;           //the function asks for an int!!!!
        }
}
