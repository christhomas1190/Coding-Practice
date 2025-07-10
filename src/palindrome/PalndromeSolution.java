package palindrome;

public class PalndromeSolution {

    public boolean isPalindrome(int x) {
        // Negative numbers are never palindromes
        if (x < 0) {
            return false;
        }
        // Convert number to string
        String numStr = String.valueOf(x);

        // Use two pointers to compare characters from both ends
        int left = 0;
        int right = numStr.length() - 1;


}
