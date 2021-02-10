package Tax;

public class ShopAccommodation extends Accommodation {
    double money;

    public ShopAccommodation(double s, double taxK, double money) {
        super(s, taxK);
        this.money = money;
    }

    @Override
    public double calculateTax() {
        if (money < 100) {
            return 0;

        } else {
         return super.calculateTax();
        }
    }
}




