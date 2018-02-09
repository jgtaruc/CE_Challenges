import java.util.ArrayList;

public class Main {
    private static int n = 1000;

    public static void main(String[] args) {
        int i = 2;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(arr.size() != 1000) {
            if(isPrime(i)) {
                arr.add(i);
            }
            i++;
        }
        
        System.out.println(sumAll(arr));
    }

    /*this primality test is from stackoverflow
    fermats little theorem is slow after 1021*/
    public static boolean isPrime(int n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }

    public static int sumAll(ArrayList<Integer> arr) {
        int i = 0;
        int sum = 0;
        for(i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }

        return sum;
    }
}