package Transport;

public class TransportMain {
    public static void main(String[] args) {
        Airplane airbus = new Airplane(222, "Airbus", 121232, 2);
        airbus.vehicleRegistrationCertificate();
        airbus.plane();

        Train lokomotiv = new Train(120,"Lokomotiv",60000,6);
        lokomotiv.vehicleRegistrationCertificate();
        lokomotiv.train();
    }
}
