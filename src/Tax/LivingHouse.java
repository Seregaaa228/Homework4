package Tax;

public class LivingHouse extends Accommodation {
    double subsidia;
    public LivingHouse(double s, double taxK, double subsidia) {
        super(s, taxK);
        this.subsidia = subsidia;
    }
    @Override
    public double calculateTax() {
        return super.calculateTax() - subsidia;
    }
}
