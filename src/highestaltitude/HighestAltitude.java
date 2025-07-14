package highestaltitude;

public class HighestAltitude {
    public int findHighestAltitude(int[] gain){
        int temp =0;
        int highestNet = 0;

            for(int i=0; i< gain.length; i++){
                temp += gain[i];
                if(temp>highestNet){
                    highestNet=temp;
                }
            }
        return highestNet;
    }
}
