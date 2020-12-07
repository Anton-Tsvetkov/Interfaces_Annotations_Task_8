public class Tanker extends CargoShip {

    public Tanker(String name, String serialNumb,
                  int displacement, int length, int width, int height,
                  String homePort, String cargo, String destination,
                  Engine engine) {
        super(name, serialNumb, displacement, length, width, height, homePort, cargo, destination, engine);
    }

    public Tanker(String name, String serialNumb,
                  int displacement, int length, int width, int height,
                  String enginePower, String engineVolume) {
        super(name, serialNumb, displacement, length, width, height, enginePower, engineVolume);
    }

    @Override
    public String toString() {
        return "Tanker{" +
                "name='" + getName() + '\'' +
                ", serialNumb='" + getSerialNumb() + '\'' +
                ", displacement=" + getDisplacement() +
                ", length=" + getLength() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                ", homePort='" + getHomePort() + '\'' +
                ", cargo='" + getCargo() + '\'' +
                ", destination='" + getDestination() + '\'' +
                ", engine=" + getEngine() +
                ", isSail=" + isSail() +
                '}';

    }
}

