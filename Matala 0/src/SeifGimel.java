public class SeifGimel {
    public static void main(String[] args) {
        int p1, num=60119912 , p2=0;
        for (int i=2 ; i<=num ; i++){
            if (primeNum(i)==true){
                p2++;
            }
        }
        System.out.println("total prime numbers are: "+p2);
    }
    public static boolean primeNum(int prime){
        int i;
        if (prime == 2) return true;
        if (prime<2) return false;
        if (prime % 2 == 0 ) return false;
        for ( i=3; i<=Math.sqrt(prime) ;i = i+2) {
            if (prime % i==0) {
                return false;
            }
        }
        return true;
    }
}
