import java.util.*;
public class seive_prime {
    public static void main(String[] args) {
        int n = 30;  // find primes up to 30

        boolean[] isPrime = new boolean[n + 1];

        // Step 1: Assume all are prime
        Arrays.fill(isPrime, true);

        // 0 and 1 are not prime
        isPrime[0] = false;
        isPrime[1] = false;

        // Step 2: Sieve logic
        for(int i = 2; i * i <= n; i++) {
            if(isPrime[i]) {
                for(int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 3: Print primes
        for(int i = 2; i <= n; i++) {
            if(isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
