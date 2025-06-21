/*
    What it is: 
    Factorial of a number n is the product of all positive integers from 1 to n. 
    Written as n! 
    Example: 5! = 5 × 4 × 3 × 2 × 1 = 120 
    Key points: 
    Used in permutations, combinations, and probability 
    Can be calculated using loops or recursion 
    Base case: 0! = 1
*/

public class Factorial_01 { 
static int factorial(int n) { 
if (n == 0 || n == 1) return 1; // Base case 
return n * factorial(n - 1);    // Recursive call 
    } 
 
    public static void main(String[] args) { 
        System.out.println(factorial(5)); // Output: 120 
    } 
}