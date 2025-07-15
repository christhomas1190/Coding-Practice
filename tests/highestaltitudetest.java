import highestaltitude.HighestAltitude;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class highestaltitudetest {

    HighestAltitude highestAltitude;

@BeforeEach
    void setUp(){
    highestAltitude = new HighestAltitude();
}

@Test
    void allPositiveTest (){
    //Given
    int[] gain = {3, 5, 2, 4, 6};
    //When
    int output = 20;
    //then
    assertEquals(output,highestAltitude.findHighestAltitude(gain));
}

@Test
    void allNegativeTest(){
    //Given
    int[] gain = {-2, -4, -3, -5, -1};
    //when
    int output =0;
    //then
    assertEquals(output, highestAltitude.findHighestAltitude(gain));

}
@Test
    void mixedNumbersTest(){
    //Given
    int[] gain = {4, -2, 3, -1, -5, 6};
    //when
    int output=5;
    //then
    assertEquals(output, highestAltitude.findHighestAltitude(gain));

}
@Test
    void alternatingNumbersTest(){
    //Given
        int[] gain = {1, -1, 2, -2, 3, -3};
    //when
    int output=3;
    //then
    assertEquals(output, highestAltitude.findHighestAltitude(gain));

}
}
