/*
    GCD(HCF): Greatest Common Divisor, GCD of two numbers is the largest number that divides
    both of them without leaving any remainder.

    What it is: 
    The largest number that divides two numbers exactly 
    Example: GCD of 12 and 18 is 6 
    Key points: 
    Also called HCF (Highest Common Factor) 
    Used in reducing fractions and LCM calculation 
    Found using Euclidean Algorithm: gcd(a, b) = gcd(b, a % b)
*/

public class GCD_06 {
     static int gcd(int a, int b) { 
        if (b == 0) return a; 
        return gcd(b, a % b); 
    } 
 
    public static void main(String[] args) { 
        System.out.println(gcd(24, 36)); // 12 
    }
}
