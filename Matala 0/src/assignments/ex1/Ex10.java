package assignments.ex1;


public class Ex10 {

       public static int converToTen(String str , int base){
           int newNum = 0 , power= 0;
           if (!isNumber(str))                                                                      //if number isnt valid return -1
               return -1;                                                                           //

           String []a = str.split("b");                                                       //split the string before and after the "b"
           String number = a[0];                                                                    //

           if(base < 10) {                                                                           //if the base is under 10. if the number has no chars which are not numbers. **just to do faster calculations...**
               int num = Integer.parseInt(number);
               while (num > 0) {                                                                     //stop condition
                   int x = num % 10;                                                                 //update x
                   newNum = (int) (newNum + x * (Math.pow(base, power)));                            //update number value
                   num = num / 10;                                                                   //
                   power++;                                                                          //
               }
           }
           else {                                                                                              //in case number digits is beyond 9 caculate here
               int indx = (number.length()-1) ;                                                                //this will indicate for the string index and for the power to multiply.for converting  to 10.
               while (indx >= 0) {                                                                             //stop condition when index of number is at 0. run from last to first index
                   if (number.charAt(indx) >= 'A') {
                       newNum = (int) (newNum + (number.charAt(indx) - 'A' + 10) * (Math.pow(base, power)));  //update the counter to itself plus the char value.
                       power++;                                                                               //
                       indx--;                                                                                //
                   } else {                                                                                   //if the char is a digit convert it to int and add it to counter in base 10.
                       int num = Character.getNumericValue(number.charAt(indx));                              //make the string char an int
                       newNum = (int) (newNum + num * (Math.pow(base, power)));                               //update number in base ten
                       power++;
                       indx--;
                   }
               }
           }
           //the number in base ten
           return newNum;
       }
//
//
//                                                                  notes mooved above lines




       //   converting to the wanted base
        public static String converToBase(int num, int base){
            String str = "";
            //while the num dividing isnt finished
            while (num > 0){
                //if the number modulu isa char update number value and actual string
                if (num % base > 9) {
                    str = str + (char)('A' + (num % base - 10));
                    num = num / base;
                }
                //else it is a normal number and caculate and update rest
                else {
                    str = str + (num % base);
                    num = num / base;
                }
            }
            //revers the string and return it
            str=  new StringBuilder(str).reverse().toString();
            return str;
        }


    // This method extracts the base (radix) from a string formatted as "numberbbase".
    public static int theNumberBase(String str) {
        int ans; // Variable to store the extracted base.

        // Split the input string into two parts: the number and the base, separated by 'b'.
        String[] a = str.split("b");
        String baseNum2 = a[1]; // The second part contains the base.

        // Check if the base starts with a letter (e.g., 'A' for hexadecimal).
        if (baseNum2.charAt(0) > 57) { // ASCII value > 57 corresponds to characters above '9'.
            ans = (baseNum2.charAt(0) - 65) + 10; // Convert 'A'-'G' to numeric values (10-16).
        } else {
            // If the base is a digit (e.g., "10" for decimal).
            ans = Integer.parseInt(baseNum2); // Parse the base as an integer.
        }

        return ans; // Return the extracted base.
    }

    // This method converts a single character string to its corresponding numeric value as a base.
    public static int inputBase(String str) {
        int ans; // Variable to store the numeric value of the base.

        // Check if the input string represents a letter (e.g., 'A' for hexadecimal).
        if (str.charAt(0) > 57) { // ASCII value > 57 corresponds to characters above '9'.
            ans = (str.charAt(0) - 65) + 10; // Convert 'A'-'G' to numeric values (10-16).
        } else {
            // If the input string represents a digit (e.g., "10" for decimal).
            ans = Integer.parseInt(str); // Parse the string as an integer.
        }

        return ans; // Return the numeric value of the base.
    }

    // This method checks if a given string is a valid "numberbbase" format.
    public static boolean isNumber(String a) {
        boolean ans = true; // Variable to store if the string is valid.

        // Check if the string contains the separator 'b'.
        if (!a.contains("b")) {
            return ans = false; // If 'b' is missing, it's not valid.
        }

        int counter = 0; // Counter for occurrences of 'b'.
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'b') {
                counter++;
                if (counter != 1) { // More than one 'b' is invalid.
                    return ans = false;
                }
            }
        }

        // If the string length is greater than 1, validate further.
        if (a.length() > 1) {
            String[] str = a.split("b"); // Split into number and base.
            String base = str[1];
            String number = str[0];

            // Validate each character of the number.
            for (int i = 0; i < number.length(); i++) {
                if (number.charAt(i) < '0' || (number.charAt(i) > '9' && number.charAt(i) < 'A') ||
                        number.charAt(i) > 'G' || number.charAt(i) >= base.charAt(0)) {
                    ans = false;
                }
            }

            // Validate the base.
            if (base.length() != 1 || base.charAt(0) < '2' ||
                    (base.charAt(0) > '9' && base.charAt(0) < 'A') || base.charAt(0) > 'G') {
                ans = false;
            }

            return ans; // Return validation result.
        }

        return ans = false; // Return false if the format is invalid.
    }

    // This method checks if two strings are equal.
    public static boolean equals(String n1, String n2) {
        boolean ans = true; // Variable to store equality result.

        // If lengths differ, strings are not equal.
        if (n1.length() != n2.length()) {
            return false;
        }

        // Compare characters of both strings.
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) != n2.charAt(i)) {
                return false; // Return false if any character differs.
            }
        }

        return ans; // Return true if strings are equal.
    }

    public static int maxIndex(String[] arr) {
        // Check for empty array
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        // Get the first string
        String s = arr[0];
        int ans = 0;

        // Iterate through all characters in the string
        for (int j = 0; j < s.length(); j++) {
            // Convert character to integer
            int temp;
            if (s.charAt(j) > '9') {
                // For alphabetic characters (A-Z)
                temp = (s.charAt(j) - 'A') + 10;
            } else {
                // For numeric characters (0-9)
                temp = s.charAt(j) - '0';
            }

            // Update max value
            if (temp > ans) {
                ans = temp;
            }
        }

        return ans;
    }
}
