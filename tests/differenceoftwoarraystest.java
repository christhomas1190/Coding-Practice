import differenceoftwoarrays.DifferenceOfTwoArrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;


import java.awt.*;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class differenceoftwoarraystest {

   private DifferenceOfTwoArrays differenceOfTwoArrays;
    private int [] nums1;
    private int [] nums2;

    @BeforeEach
    void setUp(){
        differenceOfTwoArrays=new DifferenceOfTwoArrays();

    }
@Test
   void twoTypicalArraysTest(){
        //Given
       nums1 = new int[]{1, 2, 3};
       nums2 = new int[]{2, 4, 6};
        //When
       List<List<Integer>> result = differenceOfTwoArrays.findDifference(nums1,nums2);
       //Then
    assertEquals(Arrays.asList(1, 3), result.get(0));
    assertEquals(Arrays.asList(4, 6), result.get(1));
   }
   @Test
    void differentArrays(){
        //Given
       nums1 = new int[]{7, 8, 9};
       nums2 = new int[]{1, 2, 3};
       //When
       List<List<Integer>>result=differenceOfTwoArrays.findDifference(nums1,nums2);
       //Then
       assertEquals(Arrays.asList(7,8,9), result.get(0));
       assertEquals(Arrays.asList(1,2,3), result.get(1));
   }

    @Test
    void OneEmptyArrays(){
        //Given
        nums1 = new int[]{};
        nums2 = new int[]{1, 2, 3};
        //When
        List<List<Integer>>result=differenceOfTwoArrays.findDifference(nums1,nums2);
        //Then
        assertEquals(Arrays.asList(), result.get(0));
        assertEquals(Arrays.asList(1,2,3), result.get(1));
    }
}
