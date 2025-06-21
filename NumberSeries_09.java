/*
    Number series -> Sum of first n natural numbers.
    What it is: 
    A way to calculate the sum of a known pattern of numbers 
    Example: 1 + 2 + 3 + ... + n = n(n + 1)/2 
    Key points: 
    Direct formula gives result in constant time 
    Avoids loops and saves time 
    Useful in pattern problems 
*/

public class NumberSeries_09 {
     static int sumOfN(int n) { 
        return n * (n + 1) / 2; 
    } 
 
    public static void main(String[] args) { 
        System.out.println(sumOfN(10)); // 55 
    } 
}
