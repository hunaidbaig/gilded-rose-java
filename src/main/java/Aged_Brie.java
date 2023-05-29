public class Aged_Brie extends GildedRose{
    
    public Aged_Brie(String name, int quality, int daysRemaining){
        super(name, quality, daysRemaining);
    }

    public void tick(){
        daysRemaining = daysRemaining -1;

        if(quality < 20){
            quality = quality  + 2;
        }

        else if(quality > 20 && quality <50){
            quality = quality +1;
        }

        else if(daysRemaining >= 5 && quality == 10){
            quality = quality +1;
        }
    }

    public int getQuality(){
        return quality;
    }

    public int getRemainingDays(){
        return daysRemaining;
    }
}
