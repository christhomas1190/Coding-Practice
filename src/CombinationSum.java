import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSumIII(int k, int n){
        List<List<Integer>> result=new ArrayList<>();
        findCombos(k,n,1,new ArrayList<>(),result);
        return result;
    }

    private void findCombos(int k,int n,int start, List<Integer>current, List<List<Integer>> results){
        if(current.size()==k || n==0){
            return;
        }
            for(int i = 0; i <=9; i++){
                current.add(i);
                findCombos(k, n-1, i+1, current, results);
                current.remove(current.size()-1);
            }
    }
}
