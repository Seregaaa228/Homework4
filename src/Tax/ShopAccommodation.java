package Tax;

public class ShopAccommodation extends Accommodation {
    int money;
    public  ShopAccommodation(int s, int taxK, int money){
        super(s, taxK);
        this.money = money;
    }
    public void setTaxK(){
        if (this.money < 100){
            System.out.println("Налог не взымается");
        }else {
            System.out.println("Налог торговой недвижимости - " + (getS() * getTaxK() + "грн."));
        }

    }
}

