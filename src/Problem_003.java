public class Problem_003 {
    /**
     *  Euler problem 3: Calculate largest prime factor of a number
     */
    boolean checkPrime(long number) {
        // Corner case
        if (number <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;
        return true;
    }
     long largestPrimeFactor(long number) {
        long largestPrimeNumber = 0;
        for(long i=2;i<number;i++){
            if(number%i == 0){
                if(checkPrime(i)){
                    if(largestPrimeNumber < i){
                        largestPrimeNumber = i;
                    }
                }
            }
        }
        return largestPrimeNumber;
    }
}
