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

        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // All characters matched
    }

}
