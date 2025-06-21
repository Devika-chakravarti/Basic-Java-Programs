/*
 * Modular Arithmetic: system of arithmetic for integers, where numbers wrap around after 
 * reaching a certain value - called the modulus.
 * Example -> It's like clock.
 * When you go past 12, the numbers start again from 1.
 
    What it is: 
    Arithmetic done with a fixed base value (modulus) 
    Example: 17 % 5 = 2 
    Key points: 
    Prevents overflow in large number calculations 
    Common in competitive coding and cryptography 
    Properties like (a + b) % m = ((a % m) + (b % m)) % m help with simplification
 */

public class ModularArithmetic_08 {
     static int modularAdd(int a, int b, int mod) { 
        return ((a % mod) + (b % mod)) % mod; 
    } 
 
    public static void main(String[] args) { 
        System.out.println(modularAdd(10000000, 20000000, 1000000007)); // safe from overflow 
    } 
}
