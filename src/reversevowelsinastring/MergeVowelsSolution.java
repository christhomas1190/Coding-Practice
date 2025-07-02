package reversevowelsinastring;

public class MergeVowelsSolution {
    public String reverseVowels(String s){
        String vowels = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder(s);
        int leftMoveRight = 0;
        int rightMoveLeft = s.length() - 1;

        while(leftMoveRight < rightMoveLeft){
            while(leftMoveRight < rightMoveLeft && !vowels.contains(String.valueOf(sb.charAt(leftMoveRight)))){
                leftMoveRight++;
            }
            while(leftMoveRight < rightMoveLeft && !vowels.contains(String.valueOf(sb.charAt(rightMoveLeft)))){
                rightMoveLeft--;
            }

            // swap characters
            char temp = sb.charAt(leftMoveRight);
            sb.setCharAt(leftMoveRight, sb.charAt(rightMoveLeft));
            sb.setCharAt(rightMoveLeft, temp);

            leftMoveRight++;
            rightMoveLeft--;
        }

        return sb.toString();
    }
}
