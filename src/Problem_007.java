public class Problem_007 {
    boolean checkPrime(long number) {
        if (number <= 1)
            return false;

        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;
        return true;
    }

    int positionOfPrimeNumber(int position){
        int countPosition=0, i;
        for(i=2;countPosition<position;i++){
            if(checkPrime(i))
                countPosition+=1;
        }
        return i-1;
    }

}
