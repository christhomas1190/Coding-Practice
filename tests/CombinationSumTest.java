import combinationsum.CombinationSum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
