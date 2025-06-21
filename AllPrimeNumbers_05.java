/*
    Sieve of Eratosthenes: Famous and simple algorithm used in programming to find
    all prime numbers up to a given number, n.

    What it is: 
    An efficient algorithm to find all prime numbers up to a given number n 
    Key points: 
    Use a boolean array to mark non-prime numbers 
    Start from 2 and mark all multiples of it 
    Time complexity: O(n log log n), much faster than checking one by one
*/

import java.util.*;

public class AllPrimeNumbers_05 {
      static void sieve(int n) { 
        boolean[] isPrime = new boolean[n + 1]; 
        Arrays.fill(isPrime, true); 
        isPrime[0] = isPrime[1] = false; 
 
        for (int i = 2; i * i <= n; i++) { 
            if (isPrime[i]) { 
                for (int j = i * i; j <= n; j += i) { 
                    isPrime[j] = false; 
                } 
            } 
        } 
 
        for (int i = 2; i <= n; i++) { 
            if (isPrime[i]) System.out.print(i + " "); 
        } 
    } 
 
    public static void main(String[] args) { 
        sieve(50); 
    } 
}
