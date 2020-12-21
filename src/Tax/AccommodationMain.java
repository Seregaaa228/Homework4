package Tax;

import static Tax.Accommodation.setTaxK;

public class AccommodationMain {
    public static void main(String[] args) {
        FactoryAccommodation accommodation = new FactoryAccommodation(47,52);
        LivingHouse accommodation1 = new LivingHouse(66,22,500);
        ShopAccommodation accommodation2 = new ShopAccommodation(66,11,100);
        setTaxK(accommodation1);

    }
}
