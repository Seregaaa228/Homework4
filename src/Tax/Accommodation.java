package Tax;

public class Accommodation {
    private int s;
    private int taxK;

    public int getS() {
        return s;
    }
    public int getTaxK() {
        return taxK;
    }


    public Accommodation(int s, int taxK) {
        this.s = s;
        this.taxK = taxK;
        System.out.println("Ваша площадь недвижимости - " + s + ".");
        System.out.println("Ваш налог на 1.квм недвижимости - " + taxK + ".");
        System.out.println("---------------------------------------------------");

    }


    public void setTaxK() {
        System.out.println("Налог недвижимости - " + (getS() * getTaxK() + "грн."));
    }
}



