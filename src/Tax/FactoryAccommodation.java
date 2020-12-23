package Tax;

public class FactoryAccommodation extends Accommodation {
    public  FactoryAccommodation(double s, double taxK){
        super(s,taxK);


    }
    @Override
    public double calculateTax(){
        double i = super.calculateTax();
        System.out.println(i);
        return  i;
    }
}
