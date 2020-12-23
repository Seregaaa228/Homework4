package Tax;

public class LivingHouse extends Accommodation{
   private double subsidia;
    public  LivingHouse(double s, double taxK, double subsidia){
        super(s, taxK);
        this.subsidia = subsidia;
    }
    @Override
    public double calculateTax(){
        double i = super.calculateTax();

           double result = i - subsidia;
        System.out.println(result);
           return  result;

    }

}
