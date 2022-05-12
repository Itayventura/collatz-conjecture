public class CollatzConjecture {

    public static void validateCollatzNumber(long n){
        long m = n;
        while (m >= n){
            if((m&1) == 1) { //ODD
                m = m*3 + 1;
            } else{ //even
                m = m>>1;
            }
            if(m < 0){
                System.out.println(m + " is out of bounds and bigger than the upper limit " + Long.MAX_VALUE + ". we reached: " + n);
                throw new NullPointerException();
            }
        }
    }

    public static void main(String[] args) {

        for(long i = 2; i<= 8528817511L; i++){
            validateCollatzNumber(i);
            if((i & 16777215L) == 0) { //print every x numbers
                System.out.println(i);
            }
        }
    }
}
