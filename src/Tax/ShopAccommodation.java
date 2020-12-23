package Tax;

public class ShopAccommodation extends Accommodation {
    double money;
    public  ShopAccommodation(double s, double taxK, double money){
        super(s, taxK);
        this.money = money;
    }
    @Override
    public double calculateTax(){
        if (this.money < 100){
            System.out.println("Налог не взымается");
            return 0;
        } else {
            double i =  super.calculateTax();
            System.out.println(i);
            return  i;
        }
    }

    }


