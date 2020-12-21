package Tax;

public class LivingHouse extends Accommodation{
   private int subsidia;
    public  LivingHouse(int s, int taxK, int subsidia){
        super(s, taxK);
        this.subsidia = subsidia;
    }
    public int getSubsidia() {
        return subsidia;
    }
}
