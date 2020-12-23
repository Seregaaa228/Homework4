package Tax;

public class FactoryAccommodation extends Accommodation {
    public FactoryAccommodation(double s, double taxK) {
        super(s, taxK);


    }

    @Override
    public double calculateTax() {
        double k = super.calculateTax();
        return k;
    }
}
