public class BackstagePass extends GildedRose{
    
    public BackstagePass(String name, int quality, int daysRemaining){
        super(name, quality, daysRemaining);
    }

    public void tick(){
        daysRemaining = daysRemaining -1;
        if(quality == 50){
            return;
        }
        quality = quality +1;
        if(daysRemaining <= 10  && daysRemaining > 5){
           quality = quality +1;
        }

        if(daysRemaining <= 5 && daysRemaining > 0){
            quality = quality + 2;
        }
        else if(daysRemaining < 0){
            quality = 0;
        }
    }

    public int getQuality(){
        return quality;
    }

    public int getRemainingDays(){
        return daysRemaining;
    }
}
