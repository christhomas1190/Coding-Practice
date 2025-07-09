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
    @Test
    void expectAB(){
        //given
        String str1 = "ABABAB", str2 = "ABAB";
        //when
        String output = greatestCommonDenom.gcdOfStrings(str1,str2);
        //then
        assertEquals("AB",output);
    }
    @Test
    void expectXYZ(){
        //given
        String str1 = "XYZXYZ", str2 = "XYZ";
        //when
        String output = greatestCommonDenom.gcdOfStrings(str1,str2);
        //then
        assertEquals("XYZ",output);
    }

    @Test
    void expectempty1(){
        //given
       String str1 = "ABCDEF", str2 = "ABC";
        //when
        String output = greatestCommonDenom.gcdOfStrings(str1,str2);
        //then
        assertEquals("",output);
    }
    @Test
    void expectempty2(){
        //given
        String str1 = "A", str2 = "A";
        //when
        String output = greatestCommonDenom.gcdOfStrings(str1,str2);
        //then
        assertEquals("A",output);
    }




}
