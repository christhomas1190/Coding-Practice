import flowerplanters.FlowerToPlant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class flowerplatertest {

    FlowerToPlant flowerToPlant;
    int[] planter;
    int toPlant;
    @BeforeEach
    void setup(){
        flowerToPlant=new FlowerToPlant();

    }

    @Test
    void arrayof5(){
        //Given
        int[] planter = new int[]{1, 0, 0, 0, 1};
        toPlant=1;

        //When
        boolean results = flowerToPlant.canPlaceFlowers(planter, toPlant);

        //Then
        assertTrue(results);
    }


}
