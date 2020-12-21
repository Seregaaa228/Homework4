package Transport;

public class Transport {
    private int passengers;
    private String name;
    private int weight;


    public Transport(int passengers, String name, int weight){
        this.passengers = passengers;
        this.name = name;
        this.weight = weight;

    }

    public void vehicleRegistrationCertificate(){
        System.out.println("Сколько вместимость транспорта - "+ passengers);
        System.out.println("Название транспорта - "+ name);
        System.out.println("Вес транспорта - "+ weight);
        System.out.println("-------------------------------------");
    }

}
