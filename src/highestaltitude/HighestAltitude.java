package highestaltitude;

public class HighestAltitude {
    public int findHighestAltitude(int[] gain){
        int temp =0;
        int highestNet = 0;

            for(int i=0; i< gain.length; i++){
                //Adds values in array, and stores them in temp
                temp += gain[i];
                //Checks if temp is greater than the highest net altitude
                if(temp>highestNet){
                    //i
                    highestNet=temp;
                }
            }
        return highestNet;
    }
}
