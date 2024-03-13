public class Problem_009 {
    void pythagoreanTriplet() {
        int sum = 1000;
        for (int i = 1; i < sum; i++) {
            for (int j = 2; j < sum - 1; j++) {
                for (int k = 3; k < sum -2; k++) {
                    if  ((i * i + j * j) == k*k && i + j + k == sum) {
                        System.out.println("Product of the numbers are: " + i*j*k);
                    }
                }
            }

        }
    }
    
}
