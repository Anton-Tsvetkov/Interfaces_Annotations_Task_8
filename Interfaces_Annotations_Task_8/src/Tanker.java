public class Tanker extends CargoShip{

    String cargo;
    String destination;
    String homePort;

    public Tanker(String name, String serialNumb, int displacement, int length, int width, int height, Engine engine) {
        super(name, serialNumb, displacement, length, width, height, engine);
    }

    public Tanker(String name, String serialNumb, int displacement, int length, int width, int height, String enginePower, String engineVolume) {
        super(name, serialNumb, displacement, length, width, height, enginePower, engineVolume);
    }
}
