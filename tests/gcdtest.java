import GCD.GreatestCommonDenom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class gcdtest {

    private GreatestCommonDenom greatestCommonDenom;

    @BeforeEach
    void setUp (){
        greatestCommonDenom = new GreatestCommonDenom();
    }

    @Test
    void expectABC(){
        //given
        String str1 = "ABCABC", str2 = "ABC";
        //when
        String output = greatestCommonDenom.gcdOfStrings(str1,str2);
        //then
        assertEquals("ABC",output);

    }

}
