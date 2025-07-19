package differenceoftwoarrays;

import java.util.ArrayList;
import java.util.List;

public class DifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i <nums1.length; i++) {
            int temp = nums1[i];
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (temp == nums2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found == temp1.contains(temp)) {
                temp1.add(temp);
            }
        }
            for(int i = 0; i<nums2.length; i++){
                int temp = 0;
                boolean found = false;
                for(int j = 0; j<nums2.length;j++){
                    if(!found&&temp2.contains(temp));
                    temp2.add(temp);
                }
            }
            result.add(temp1);
            result.add(temp2);
           return result;
    }
}
