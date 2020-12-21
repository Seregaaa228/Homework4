package Tax;

public class Accommodation {
    private int s;
    private int taxK;


    public Accommodation(int s, int taxK) {
        this.s = s;
        this.taxK = taxK;
        System.out.println("Ваша площадь недвижимости - " + s + ".");
        System.out.println("Ваш налог на 1.квм недвижимости - " + taxK + ".");
    }

    static void  setTaxK(Accommodation accommodation) {
        if (accommodation instanceof LivingHouse) {
            System.out.println("Налог - " + ((accommodation.s * accommodation.taxK)- ((LivingHouse) accommodation).getSubsidia() + "Грн."));
        }else if(accommodation instanceof  ShopAccommodation &&  ((ShopAccommodation) accommodation).money < 100){
            System.out.println("Налог платить не надо");

        }else if(accommodation instanceof  ShopAccommodation &&  ((ShopAccommodation) accommodation).money > 100){
            System.out.println("Налог - " + (accommodation.s * accommodation.taxK) + "Грн.");
        }else{
            System.out.println("Налог - " + (accommodation.s * accommodation.taxK) + "Грн.");
        }


    }


}

