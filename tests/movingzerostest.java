import movingzeros.MovingZeros;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class movingzerostest {

    MovingZeros movingZeros;

    @BeforeEach
    void setUp(){
        movingZeros=new MovingZeros();
    }

    @Test
    void positiveNumbersTest(){
        //given
        int[] nums = {0, 1, 2, 3, 5, 6};
        int[] expected = {1, 2, 3, 5, 6, 0};
        //when
        movingZeros.moveZeroes(nums);
        //then
        assertArrayEquals(expected,nums);

    }

    @Test
    void negativeNumbersTest(){
        //given
        int[] nums = {0, -1, -2, -3, -5, -6};
        int[] expected = {-1, -2, -3, -5, -6, 0};
        //when
        movingZeros.moveZeroes(nums);
        //then
        assertArrayEquals(expected,nums);

    }
    @Test
    void zerosInMiddleTest(){
        //given
        int[] nums = {1, 0, 2, 0, 3};
        int[] expected = {1, 2, 3, 0, 0};
        //when
        movingZeros.moveZeroes(nums);
        //then
        assertArrayEquals(expected, nums);
    }
    @Test
    void allZerosTest(){
        //given
        int[] nums = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};
        //when
        movingZeros.moveZeroes(nums);
        //then
        assertArrayEquals(expected, nums);
    }
    @Test
    void noZerosTest(){
        //given
        int[] nums = {4, 5, 6};
        int[] expected = {4, 5, 6};
        //when
        movingZeros.moveZeroes(nums);
        //then
        assertArrayEquals(expected, nums);
    }
}
