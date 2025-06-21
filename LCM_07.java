/*
    LCM: Least Common Multiple, LCM of two numbers is the smallest number that is multiple
    of both numbers.
    
    What it is: 
    The smallest number that is a multiple of both numbers 
    Example: LCM of 4 and 6 is 12 
    Key points: 
    Formula: LCM(a, b) = (a * b) / GCD(a, b) 
    Depends on GCD for efficient calculation 
    Useful in time-based problems  
*/

public class LCM_07 {
     static int gcd(int a, int b) { 
        if (b == 0) return a; 
        return gcd(b, a % b); 
    } 
 
    static int lcm(int a, int b) { 
        return (a * b) / gcd(a, b); 
    } 
 
    public static void main(String[] args) { 
        System.out.println(lcm(12, 15)); // 60 
    }
}
