import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSumIII(int k, int n){
        List<List<Integer>> result=new ArrayList<>();
        findCombos(k,n,1,new ArrayList<>(),result);
        return result;
    }

}
