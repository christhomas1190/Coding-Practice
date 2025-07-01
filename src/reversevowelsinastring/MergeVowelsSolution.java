package reversevowelsinastring;

public class MergeVowelsSolution {
    public String reverseVowels(String s){
        String vowels = "AEIOUaeiou";
        StringBuilder sb= new StringBuilder(s);
        int leftMoveRight = 0;
        int rightMoveLeft = s.length()-1;

        while(leftMoveRight<rightMoveLeft){
            while(leftMoveRight<rightMoveLeft&& !vowels.contains(sb.deleteCharAt(leftMoveRight))){
                leftMoveRight++;
            }
        }
    }
}
