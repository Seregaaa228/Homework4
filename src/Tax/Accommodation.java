package Tax;

public class Accommodation {
    double s;
    double taxK;


    public Accommodation(double s, double taxK) {
        this.s = s;
        this.taxK = taxK;
        System.out.println("Ваша площадь недвижимости - " + s + ".");
        System.out.println("Ваш налог на 1.квм недвижимости - " + taxK + ".");
        System.out.println("---------------------------------------------------");

    }


    public double calculateTax() {


        double result = s * taxK;
        return result;

    }
}



