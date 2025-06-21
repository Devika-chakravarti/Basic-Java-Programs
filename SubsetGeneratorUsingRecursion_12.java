/*
 *  What it is: 
    Subset generation means finding all possible combinations (power set) of characters from a string where 
    order doesn't matter and some characters may be excluded. 
    Key Points: 
    Each character has 2 choices: include or exclude. 
    Total subsets = 2^n for n characters. 
    Base case: When index reaches the end of the string, current subset is printed. 
    At each step, recursion branches into two: 
    One where the character is included 
    One where it is excluded 
    Useful in combinatorics, backtracking, decision-making problems, etc.
 */

public class SubsetGeneratorUsingRecursion_12 {
     static void generateSubsets(String str, String current, int index) { 
        // Base case: jab index end tak pahunch jaaye 
        if (index == str.length()) { 
            System.out.println(current); 
            return; 
        } 
 
        // Include current character 
        generateSubsets(str, current + str.charAt(index), index + 1); 
 
        // Exclude current character 
        generateSubsets(str, current, index + 1); 
    } 
 
    public static void main(String[] args) { 
        String input = "ABC"; 
        generateSubsets(input, "", 0); 
    }
}
