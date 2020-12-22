package Tax;

public class FactoryAccommodation extends Accommodation {
    public  FactoryAccommodation(int s, int taxK){
        super(s,taxK);


    }
    public void setTaxK(){
        System.out.println("Налог производственной недвижимости - " + (getS() * getTaxK() + "грн."));
    }
}
