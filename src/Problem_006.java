public class Problem_006 {
    int sumOfSquares(int number) {
        int sum = 0;
        for(int i=1;i<=number;i++){
            sum+=i*i;
        }
        return sum;
    }
    int squareOfSums(int number) {
        int sum = 0;
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        return sum*sum;
    }
    int differenceSquareSum(int number){
        return squareOfSums(number)-sumOfSquares(number);
    }
}
