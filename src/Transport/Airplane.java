package Transport;

public class Airplane extends Transport {
    private int turbines;

    public Airplane(int passengers, String name, int weight, int turbines){
        super(passengers, name, weight);
        this.turbines = turbines;

    }
    public void plane(){

        System.out.println("*Самолет летит* с турбинами - кол-во : "+ turbines);
        System.out.println("-------------------------------------");
    }

}
