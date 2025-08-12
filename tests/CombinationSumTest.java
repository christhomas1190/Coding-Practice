import combinationsum.CombinationSum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationSumTest {

    private CombinationSum combinationSum;

    @BeforeEach
    void setUp() {
        combinationSum = new CombinationSum();
    }

    @Test
    void threeNumSum() {
        // Given
        int k = 3;
        int n = 7;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 4));

        // When
        List<List<Integer>> actual = combinationSum.combinationSumIII(k, n);

        // Then
        assertEquals(expected, actual);
    }
    @Test
    void fiveNumSum() {
        // Given
        int k = 9;
        int n = 45;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        // When
        List<List<Integer>> actual = combinationSum.combinationSumIII(k, n);

        // Then
        assertEquals(expected, actual);
    }
    @Test
    void noNumSum() {
        // Given
        int k = 3;
        int n = 1;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList());

        // When
        List<List<Integer>> actual = combinationSum.combinationSumIII(k, n);

        // Then
        assertTrue(actual.isEmpty());

    }
}
