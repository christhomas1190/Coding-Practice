import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import palindrome.PalndromeSolution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Palindrometest {

    PalndromeSolution palindromeSolution;

    @BeforeEach
void setUp(){
        palindromeSolution = new PalndromeSolution();
    }
    @Test
void typicalTest(){
        //given
            int palindrome = 12121;
        //when
            boolean result = palindromeSolution.isPalindrome(palindrome);
        //then
            assertTrue(result);
}
@Test
    void singleDigitTest(){
        //given
        int palindrome = 7;
        //when
        boolean result = palindromeSolution.isPalindrome(palindrome);
        //then
        assertTrue(result);
    }

@Test
    void negativeNumberTest(){
        //given
        int palindrome = -12121;
        //when
        boolean result = palindromeSolution.isPalindrome(palindrome);
        //then
        assertFalse(result);
    }
}