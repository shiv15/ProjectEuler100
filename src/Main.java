public class Main {
    public static void main(String[] args){
        long number = 600851475143L;
        int[] multiplesArray = {3, 5};
        Problem_001 p1 = new Problem_001();
        Problem_002 p2 = new Problem_002();
        Problem_003 p3 = new Problem_003();
        Problem_004 p4 = new Problem_004();

        // Problem 001
//        System.out.println(p1.sumOfMultiples(1000, multiplesArray));

        // Problem 002
//        System.out.println(p2.evenFibonacciWP());

        // Problem 003
        System.out.println(p3.largestPrimeFactor(number));

        // Problem 004
//        System.out.println(p4.palindrome());
    }
}
