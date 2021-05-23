/**
 * The program takes limit and multiples as its input and calculates the sum of all numbers within the limit
 * which are multiples of the numbers in multiplesArray.
 */

public class Problem_001 {
    int sumOfMultiples(int limit, int[] multiplesArray){
        int sum=0;
        for(int i=1;i<limit;i++){
            for(int j=0;j<multiplesArray.length;j++){
                if(i%multiplesArray[j]==0){
                    sum += i;
                    break;
                }
            }
        }
        return sum;
    }
}
