package flowerplanters;

public class FlowerToPlant {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
    if(flowerbed.length==0) return false;
    int flowersToPlant = n;
        for(int i = 0; i<flowerbed.length;i++){
            if (flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                flowersToPlant--;
                if (flowersToPlant == 0) {
                    return true;
                }
            }
        }
        return flowersToPlant<=0;
    }
}
