package studio3;
import java.util.Scanner;

public class SieveofEratosthenes {

    public static void main(String[] args) {
        System.out.println("Enter up to what number you would like to sieve:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        

        Boolean[] isPrime = new Boolean[n + 1];
    
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
      
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}