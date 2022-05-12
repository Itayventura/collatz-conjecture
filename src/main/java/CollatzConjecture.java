import java.math.BigInteger;

public class CollatzConjecture {

    public static void validateCollatzNumber(long n){
        long m = n;
        while (m >= n){
            if((m&1) == 1) { //ODD
                m = m+m+m+1;
            } else{ //even
                m = m>>1;
            }
            if(m < 0){
                System.out.println(m + " is out of bounds and bigger than the upper limit " + Long.MAX_VALUE + ". initial number: " + n);
                validateCollatzNumber(BigInteger.valueOf(n));
            }
        }
    }

    public static boolean isOdd(BigInteger val) {
        return !val.mod(new BigInteger("2")).equals(BigInteger.ZERO);
    }

    public static void validateCollatzNumber(BigInteger n){
        System.out.println("validating that " + n + " is a collatz number with BigInteger");
        BigInteger m = n;
        while (m.compareTo(n) >= 0){
            if(isOdd(m)){
                m = m.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
            } else{
                m = m.divide(BigInteger.valueOf(2));
            }
        }
        System.out.println(n + " is a collatz number");
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for(long i = 3; i<= 20000000000L; i+=2){
            validateCollatzNumber(i);
            if((i & 16777215L) - 1 == 0) { //print every x numbers
                System.out.println("number: " +  i + " time: " + (System.currentTimeMillis()-startTime));
            }
        }
        System.out.println("algorithm took: " + (System.currentTimeMillis()-startTime));
    }
}
