public class SeifBet {
    public static void main(String[] args) {
        int p1, num=10 , p2;
        for (p1=2 ; p1<num ; p1++){
            if (primeNum(p1)==true){
                p2=num+p1;
                if (primeNum(p2))
                    System.out.println("the two prime numbers equals to "+num+ " are: "+p1+" and "+p2);
            }
        }
    }
    public static boolean primeNum(int prime){
        int i;
        if (prime<2) return false;
        for ( i=2; i<=prime/2 ;i++) {
            if (prime % i==0) {
                return false;
            }
        }
        return true;
    }

    //couculate two prime numers which give the choosen number.
    public static void plusEqualsNum (int p1, int p2, int num){
        for (p1=2 ; p1<num ; p1++){
            if (primeNum(p1)==true){    //send p1 and check if it is prime.
                p2=num-p1;              //p2 is the difference between num and p1
                if (primeNum(p2))       //check if the difference is a prime too and print result
                    System.out.println("the two prime numbers equals to "+num+ " are: "+p1+" and "+p2);
                break;
            }
        }
    }

}
