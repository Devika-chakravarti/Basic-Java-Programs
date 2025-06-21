/*
    What it is: 
    Permutation generation means finding all possible arrangements of characters in a given string where order 
    matters. 
    Key Points: 
    In total, n! (factorial) permutations exist for n unique characters. 
    Each recursive step fixes one character and finds permutations of the remaining string. 
    Base case occurs when the string becomes empty — at that point, one full permutation is ready. 
    Useful in backtracking, string problems, competitive coding, etc. 
 */

public class PermutationPrintingUsingRecursion_11 {
      static void generatePermutations(String str, String result) { 
        // Base case: agar string empty ho gayi, to result print karo 
        if (str.length() == 0) { 
            System.out.println(result); 
            return; 
        } 
 
        // Har character ke liye recursion call karo 
        for (int i = 0; i < str.length(); i++) { 
            // current character lo 
            char ch = str.charAt(i); 
 
            // remaining string ke liye (except current character) 
            String remaining = str.substring(0, i) + str.substring(i + 1); 
 
            // recursive call with new string and result 
            generatePermutations(remaining, result + ch); 
        } 
    } 
 
    public static void main(String[] args) { 
        String input = "ABC"; 
        generatePermutations(input, ""); 
    }
}
