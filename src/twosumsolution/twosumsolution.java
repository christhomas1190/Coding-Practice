package twosumsolution;

public class twosumsolution {

    public int[] solution(int[] nums, int target){
        if(nums.length==0) return null;

        for(int i = 0; i < nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
