/*
    Fast exponentiation is a method to calculate powers like a^b (a raised to power b) quickly,
    especially when b is large.
    What it is: 
    A method to calculate large powers like a^b efficiently 
    Key points: 
    Converts exponent into binary and squares the base accordingly 
    Reduces time from O(b) to O(log b) 
    Useful when working with big numbers and mod values
 */

public class FastExponentiation_10 {
     static int fastPower(int base, int exp) { 
        int result = 1; 
        while (exp > 0) { 
            if ((exp & 1) == 1) { 
                result *= base; 
            } 
            base *= base; 
            exp >>= 1; 
        } 
        return result; 
    } 
 
    public static void main(String[] args) { 
        System.out.println(fastPower(2, 10)); // 1024 
    }
}
