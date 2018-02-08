public class solution {
    private static int n = 1000;

    public static void main(String[] args) {
        int i = 0;
        for(i = n; i >= 3; i--) {
            if(isPrime(i) && isPalindrome(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        //Fermat's little theorem
        //this might fail because this solution only returns probablyPrime
        boolean probablyPrime = Math.pow(2, n-1)%n == 1;    
        return probablyPrime;
    }

    public static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        int i = 0;
        for(i=0; i<s.length(); i++) {
            char a = s.charAt(i);
            char b = s.charAt((s.length()-i)-1);
            if(a != b) {
                return false;
            }
        }
        return true;
    }
}