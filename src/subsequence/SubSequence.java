package subsequence;

public class SubSequence {
    public boolean isSubsequence(String s, String t){
        boolean result = false;
        String subSequence = "";
        int start = 0;
        for(int i = start; i < s.length();i++){
            for(int j = start; j< t.length(); j++){
                if(s.charAt(i)==t.charAt(j)){
                    subSequence += t.charAt(j);
                    start=j+1;
                    break;
                }
            }
        }
        if (subSequence.equals(s)) {
            result = true;
        }
        return result;
    }

}
