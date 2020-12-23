package Tax;

import java.util.List;



public class AccommodationMain {
    public static void main(String[] args) {
        Accommodation accommodation = new FactoryAccommodation(47,52);
        Accommodation accommodation1 = new LivingHouse(66,22,500);
        Accommodation accommodation2 = new ShopAccommodation(66,11,100);
        List<Accommodation> accommodationList = List.of( accommodation1, accommodation2, accommodation);
        for (Accommodation an: accommodationList){
            an.calculateTax();

        }


    }
}
