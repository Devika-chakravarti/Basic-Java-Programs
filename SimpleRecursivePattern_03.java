/*
    What it is: 
    Patterns printed using recursion instead of loops 
    Example: triangle of stars using recursive functions 
    Key points: 
    Helps to understand function call stack 
    Printed from top to bottom or bottom to top using recursive structure 
    Good for learning recursion basics
*/

public class SimpleRecursivePattern_03 {
     static void printStars(int n) { 
        if (n == 0) return; 
        printStars(n - 1); // recursive call 
        for (int i = 0; i < n; i++) { 
            System.out.print("*"); 
        } 
        System.out.println(); 
    } 
 
    public static void main(String[] args) { 
        printStars(5);
    }
}