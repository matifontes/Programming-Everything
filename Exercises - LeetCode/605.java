class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if(flowerbed.length ==1){
            if(flowerbed[0]==0){
                return true;
            }else if(n==0){
                return true;
            }else{
                return false;
            }
        }else{
          
            for(int i=0; i<flowerbed.length; i++){
                if(i-1 < 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0){
                    count++;
                    flowerbed[i] = 1;
                    }else if(i+1>=flowerbed.length && flowerbed[i]==0 && flowerbed[i-1] == 0){
                        count++;
                        flowerbed[i] = 1;
                        }else if(i-1>=0 && i+1<flowerbed.length && flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                            count++;
                            flowerbed[i] = 1;
                        }
                if(count>= n)
                    return true;
            }
        
        }

        return false;
    }
}
