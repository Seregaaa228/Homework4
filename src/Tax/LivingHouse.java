package Tax;

public class LivingHouse extends Accommodation{
   private int subsidia;
    public  LivingHouse(int s, int taxK, int subsidia){
        super(s, taxK);
        this.subsidia = subsidia;
    }
    public void setTaxK(){
        System.out.println("Налог жилой недвижимости - " + ((getS() * getTaxK()- subsidia) + "грн."));
    }

}
