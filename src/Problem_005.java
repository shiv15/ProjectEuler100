public class Problem_005 {
    int smallestDivisibleNumber() {
        int flag;
        for(int i=2520;i<10000000;i+=5){
            flag = 1;
            if(i%19==0 && i%17==0) {
                for (int j = 1; j < 21; j++) {
                    if (i % j != 0) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1)
                    return i;
            }
        }
        return -1;
    }

}
