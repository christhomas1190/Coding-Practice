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
}
