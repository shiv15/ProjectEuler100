public class Problem_010 {
    void summationOfPrimes(int n)
    {
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
 
        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[p] == true) {
                // Update all multiples of p greater than or
                // equal to the square of it numbers which
                // are multiple of p and are less than p^2
                // are already been marked.
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        long sum = 0;
 
        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
        
}
// Refer: https://www.geeksforgeeks.org/sieve-of-eratosthenes/