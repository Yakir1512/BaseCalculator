public class SeifDalet {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();  // זמן התחלה
        int  num = 10119912;
        int[] arr = new int[num / 2];

        while (num % 2 == 0 && num != 1){
            System.out.print(2);
            num=num/2;
            if (num != 1)
                System.out.print("*");
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                System.out.print(i);
                num = num / i;
                if (num != 1) System.out.print("*");
            }
        }

            if (num > 2) {
                System.out.print(num);
            }







        /*while ( (double)num/i != 1 || num/i < 1) {
            for (i=i; num%i==0 && (double)num/i > 1; place++){
                arr[place] = i;
                num = num / i;
            }
            if (num == 1 || num/i == 1)
                break;
            while (i ==  arr[place-1] || primeNum(i)==false || num%i != 0 ){
                i++;
            }
        }
        //arr[place] = i;
        for(int x=0; x<arr.length-1 && arr[x] != 0; x++ )
        System.out.print(arr[x]+" * ");*/
        long endTime = System.currentTimeMillis();  // זמן סיום
        long elapsedTime = endTime - startTime;// חישוב הזמן שחלף
        System.out.println();
        System.out.println("Caoculate time is:"+elapsedTime+"Ms");
    }


    public static boolean primeNum(int prime){
        int i;
        if (prime<=2) return false;
        for ( i=2; i <= prime/2 ;i++) {
            if (prime % i==0) {
                return false;
            }
        }
        return true;
    }
}

