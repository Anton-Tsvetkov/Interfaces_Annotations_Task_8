abstract public class CargoShip implements IShip{

    private String name;
    private String serialNumb;

    private int displacement;
    private int length;
    private int width;
    private int height;

    private String homePort;
    private String cargo;
    private String destination;

    private Engine engine;
    private boolean isSail;


    public CargoShip(String name, String serialNumb,
                     int displacement, int length, int width, int height,
                     String homePort, String cargo, String destination,
                     Engine engine) {
        this.name = name;
        this.serialNumb = serialNumb;
        this.displacement = displacement;
        this.length = length;
        this.width = width;
        this.height = height;
        this.homePort = homePort;
        this.cargo = cargo;
        this.destination = destination;
        this.engine = engine;
        this.isSail = false;
    }

    public CargoShip(String name, String serialNumb, int displacement, int length, int width, int height,
                     String enginePower, String engineVolume) {
        this.name = name;
        this.serialNumb = serialNumb;
        this.displacement = displacement;
        this.length = length;
        this.width = width;
        this.height = height;
        this.engine = new Engine(enginePower, engineVolume);
    }

    public class Engine {

        boolean works;

        String powerCharacteristic;
        String volumeCharacteristic;

        int power;

        public Engine(boolean works, String powerCharacteristic, String volumeCharacteristic, int power) {
            this.works = works;
            this.powerCharacteristic = powerCharacteristic;
            this.volumeCharacteristic = volumeCharacteristic;
            this.power = power;
        }

        public Engine(String powerCharacteristic, String volumeCharacteristic) {
            this.powerCharacteristic = powerCharacteristic;
            this.volumeCharacteristic = volumeCharacteristic;
            this.power = 0;
            this.works = false;
        }

        public boolean isWorks() {
            return works;
        }

        public void setWorks(boolean works) {
            this.works = works;
        }

        public String getPowerCharacteristic() {
            return powerCharacteristic;
        }

        public void setPowerCharacteristic(String powerCharacteristic) {
            this.powerCharacteristic = powerCharacteristic;
        }

        public String getVolumeCharacteristic() {
            return volumeCharacteristic;
        }

        public void setVolumeCharacteristic(String volumeCharacteristic) {
            this.volumeCharacteristic = volumeCharacteristic;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "works=" + works +
                    ", powerCharacteristic='" + powerCharacteristic + '\'' +
                    ", volumeCharacteristic='" + volumeCharacteristic + '\'' +
                    ", power=" + power +
                    '}';
        }
    }

    public String getHomePort() {
        return homePort;
    }

    protected void setHomePort(String homePort) {
        this.homePort = homePort;
    }

    public String getCargo() {
        return cargo;
    }

    protected void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDestination() {
        return destination;
    }

    protected void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isSail() {
        return isSail;
    }

    protected void setSail(boolean sail) {
        isSail = sail;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getSerialNumb() {
        return serialNumb;
    }

    protected void setSerialNumb(String serialNumb) {
        this.serialNumb = serialNumb;
    }

    public int getDisplacement() {
        return displacement;
    }

    protected void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getLength() {
        return length;
    }

    protected void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    protected void setHeight(int height) {
        this.height = height;
    }

    public Engine getEngine() {
        return engine;
    }

    protected void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void sail() {
        engine.setWorks(true);
    }

    @Override
    public void stop() {
        engine.setWorks(false);
    }

    @Override
    public void setEnginePower(int percents) {
        if (percents >= 0 && percents <= 100) engine.setPower(percents);
        else System.out.println("Uncorrected value");
    }

    @Override
    public String toString() {
        return "CargoShip{" +
                "name='" + name + '\'' +
                ", serialNumb='" + serialNumb + '\'' +
                ", displacement=" + displacement +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", homePort='" + homePort + '\'' +
                ", cargo='" + cargo + '\'' +
                ", destination='" + destination + '\'' +
                ", engine=" + engine +
                ", isSail=" + isSail +
                '}';
    }
}
