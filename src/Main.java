public class Main {
    public static void main(String[] args){
        long number = 600851475143L;
        int[] multiplesArray = {3, 5};
        Problem_001 p1 = new Problem_001();
        Problem_002 p2 = new Problem_002();
        Problem_003 p3 = new Problem_003();
        Problem_004 p4 = new Problem_004();
        Problem_005 p5 = new Problem_005();
        Problem_006 p6 = new Problem_006();
        Problem_007 p7 = new Problem_007();
        Problem_008 p8 = new Problem_008();
        Problem_009 p9 = new Problem_009();


        // Problem 001
        System.out.println(p1.sumOfMultiples(1000, multiplesArray));

        // Problem 002
        System.out.println(p2.evenFibonacciWP());

        // Problem 003
        System.out.println(p3.largestPrimeFactor(number));

        // Problem 004
        System.out.println(p4.palindrome());

        // Problem 005
        System.out.println(p5.smallestDivisibleNumber());

        // Problem 006
        System.out.println(p6.differenceSquareSum(100));

        // Problem 007
        System.out.println(p7.positionOfPrimeNumber(10001));

        // Problem 008
        System.out.println(p8.adjacentProduct(13));

        // Problem 009
        p9.pythagoreanTriplet();


    }
}
