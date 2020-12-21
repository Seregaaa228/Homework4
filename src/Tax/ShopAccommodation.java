package Tax;

public class ShopAccommodation extends Accommodation {
    int money;
    public  ShopAccommodation(int s, int taxK, int money){
        super(s, taxK);
        this.money = money;
    }
}

