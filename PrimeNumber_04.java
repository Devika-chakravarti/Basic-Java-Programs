/*
    What it is: 
    A number greater than 1 that has no positive divisors other than 1 and itself 
    Example: 2, 3, 5, 7, 11 
    Key points: 
    Not divisible by any number except 1 and itself 
    1 is not a prime number 
    Efficiently checked by looping up to square root of the number
*/

public class PrimeNumber_04 {
     static boolean isPrime(int n) { 
        if (n <= 1) return false; 
        for (int i = 2; i * i <= n; i++) { 
            if (n % i == 0) return false; 
        } 
        return true; 
    } 
 
    public static void main(String[] args) { 
        System.out.println(isPrime(11)); // true 
    } 
}
