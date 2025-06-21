/*
    What it is: 
    A number sequence where each number is the sum of the previous two 
    Starts with 0, 1 
    Example: 0, 1, 1, 2, 3, 5, 8... 
    Key points: 
    Formula: F(n) = F(n-1) + F(n-2) 
    Common in dynamic programming 
    Recursive version is slow without memoization
*/

public class FibonacciSeries_02 {
     static int fibonacci(int n) { 
        if (n == 0) return 0; 
        if (n == 1) return 1; 
        return fibonacci(n - 1) + fibonacci(n - 2); 
    } 
 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i++) { 
            System.out.print(fibonacci(i) + " "); 
        } 
    } 
}
