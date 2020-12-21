package Transport;

public class Train extends Transport{
   private int carriage;


      public Train(int passengers, String name, int weight, int carriage) {
      super(passengers, name, weight);
      this.carriage = carriage;

   }
   public void train(){
      System.out.println("Поезд делает : Чух Чух Чух Чух Чух Чух. С кол-во вагонов - " + carriage );
      System.out.println("-------------------------------------");
   }
}
