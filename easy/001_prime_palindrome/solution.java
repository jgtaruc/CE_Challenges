public class solution {
    private static int n = 1000;

    public static void main(String[] args) {
        int i = 0;
        for(i = n; i >= 3; i--) {
            if(isPrime(i, 1) && isPalindrome(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    /*Fermat's little theorem
    This might fail because this solution only returns probably prime numbers.
    Higher k means higher accuracy
    */
    public static boolean isPrime(int n, int k) {
        if(n == 2 || n == 3) return true;

        while(k != 0) {
            int a = 2 + (int)(Math.random() % (n - 4)); 
            if(Math.pow(a, n-1) % n != 1) {
                return false;
            }
            k--;
        }
        return true;
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