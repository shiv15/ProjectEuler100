public class Problem_004 {
    boolean checkPalindrome(int number) {
        int remainder;
        int reversedNum = 0;
        int num = number;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        return number == reversedNum;
    }
    int palindrome() {
        int maxPalindrome = 0;
        int palindrome;
        for(int i=999;i!=99;i--){
            for(int j=998;j!=99;j--){
                palindrome = i*j;
                if(checkPalindrome(palindrome)){
                    if(maxPalindrome<palindrome){
                        maxPalindrome = i*j;
                    }
                }
            }
        }
       return maxPalindrome;
    }
}
