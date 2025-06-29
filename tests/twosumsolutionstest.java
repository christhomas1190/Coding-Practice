import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twosumsolution.twosumsolution;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class twosumsolutionstest {
    private twosumsolution solver;

    @BeforeEach
    public void setup() {
        solver = new twosumsolution();
    }
    @Test
    public void shouldReturnCorrectIndices_WhenValidPairExists() {
        //Given
        int[] nums = {2, 7, 15, 20};
        int target = 9;
        //when
        int[] result = solver.solution(nums, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }
    @Test
    public void shouldReturnNull_WhenNoPairExists() {
        //Given
        int[] nums = {2, 7, 15, 20};
        int target = 10;
        //when
        int[] result = solver.solution(nums, target);

        assertNull(result);
    }
    @Test
    public void shouldReturnNull_WhenArrayisEmpty() {
        //Given
        int[] nums = {};
        int target = 9;
        //when
        int[] result = solver.solution(nums, target);

        assertNull(result);
    }
    @Test
    public void shouldReturnNull_WhenArrayHasOneIndex() {
        //Given
        int[] nums = {5};
        int target = 5;
        //when
        int[] result = solver.solution(nums, target);

        assertNull(result);
    }

}
