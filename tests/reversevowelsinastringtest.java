import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reversevowelsinastring.MergeVowelsSolution;

import static org.junit.Assert.assertEquals;

public class reversevowelsinastringtest {

    private MergeVowelsSolution mergeVowelsSolution;

    @BeforeEach
    void setup(){
        mergeVowelsSolution = new MergeVowelsSolution();
    }
    @Test
    void allCharactersAreLettersTest (){
        //Given
        String input = "Hello there";

        //When
        String results = mergeVowelsSolution.reverseVowels(input);

        //Then
        assertEquals("Helle thore",results);

    }
    @Test
    void notAllCharactersAreLettersTest (){
        //Given
        String input = "Ai8756hatkWoiBV,!a";

        //When
        String results = mergeVowelsSolution.reverseVowels(input);

        //Then
        assertEquals("ai8756hotkWaiBV,!A",results);

    }

    @Test
    void noVowelsTest (){
        //Given
        String input = "wthgdqbn,c";

        //When
        String results = mergeVowelsSolution.reverseVowels(input);

        //Then
        assertEquals("wthgdqbn,c",results);

    }
    @Test
    void onlyVowelsTest (){
        //Given
        String input = "aeiouAEIOU";
        //When
        String results = mergeVowelsSolution.reverseVowels(input);
        //Then
        assertEquals("UOIEAuoiea",results);

    }


}
