import java.math.BigInteger;

public class Problem_002 {
    long evenSum=0;
    long evenFibonacci(long number, long sum) {
        /*
        * sum of the even numbers of the fibonacci numbers until 4 million
        * Using tail recursive
        * */

        if(number < 4000000) {
            if(number%2==0)
                evenSum += number;
            return evenFibonacci(sum, sum+number);
        }
        return evenSum;
    }

    long evenFibonacciWP() {
        return evenFibonacci( 1, 2);
    }
}
