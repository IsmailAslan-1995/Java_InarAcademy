public class Exercise_29 {
    //Twin primes
    public static void main(String[] args) {
        final int MAXIMUM_VALUE_OF_PRIME_NUMBER=1000;

        for(int i=2;i<MAXIMUM_VALUE_OF_PRIME_NUMBER;i++){
            if(twinPrime(i)!="") {
                System.out.println(twinPrime(i));
            }
        }
    }
    public static boolean isPrime(int number){
        // method which use to determine number is prime or not
        int i = 2; // the smallest number to check prime number

        for (i = 2; i <= number/2; i++) {
            if (number % i == 0) {

                return false;
            }
        }
        return true;
    }
    public static String twinPrime(int number){
        final int MAXIMUM_VALUE_OF_PRIME_NUMBER=1000;

            if (isPrime(number)&&isPrime(number+2)) {
                return"("+number+","+(number+2)+")";
        }
        return "";
    }
}

