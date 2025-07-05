import flowerplanters.FlowerToPlant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

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
    @Test
    void emptyArrar(){
        //Given
        int[] planter = new int[]{};
        toPlant=1;

        //When
        boolean results= flowerToPlant.canPlaceFlowers(planter,toPlant);

        //Then
        assertFalse(results);
    }

    @Test
    void noFlowerToPlant(){
        //given
        int [] planter = new int[] {1,0,0,0,1};
        toPlant=0;

        //when
        boolean results = flowerToPlant.canPlaceFlowers(planter,toPlant);

        //then
        assertTrue(results);
    }

    @Test
    void notEnoughSpaceToPlant (){
        int[] planter= new int[]{1,0,0,0,1};
        toPlant= 2;

        boolean results = flowerToPlant.canPlaceFlowers(planter,toPlant);

        assertFalse(results);
    }

}
