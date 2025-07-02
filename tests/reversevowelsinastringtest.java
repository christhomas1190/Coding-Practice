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


}
