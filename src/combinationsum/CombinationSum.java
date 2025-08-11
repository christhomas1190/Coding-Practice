package combinationsum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSumIII(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        findCombos(k, n, 1, new ArrayList<>(), result);
        return result;
    }

    private void findCombos(int k, int n, int start, List<Integer> current, List<List<Integer>> results) {
        if (current.size() == k) {
            if (n == 0) {
                results.add(new ArrayList<>(current));
            }
            return;
        }
        for (int i = start; i <= 9; i++) {
            if (i > n) break;
            current.add(i);
            findCombos(k, n - i, i + 1, current, results);
            current.remove(current.size() - 1);
        }
    }
}
