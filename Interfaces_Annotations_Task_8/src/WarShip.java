abstract public class WarShip implements IShip{

    private String name;
    private String serialNumb;

    private int displacement;
    private int length;
    private int width;
    private int height;

    private Engine engine;
    private boolean isSail;


    public WarShip(String name, String serialNumb, int displacement, int length, int width, int height, Engine engine) {
        this.name = name;
        this.serialNumb = serialNumb;
        this.displacement = displacement;
        this.length = length;
        this.width = width;
        this.height = height;
        this.engine = engine;
    }

    public WarShip(String name, String serialNumb, int displacement, int length, int width, int height,
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

    public boolean isSail() {
        return isSail;
    }

    public void setSail(boolean sail) {
        isSail = sail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumb() {
        return serialNumb;
    }

    public void setSerialNumb(String serialNumb) {
        this.serialNumb = serialNumb;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
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
        return "WarShip{" +
                "name='" + name + '\'' +
                ", serialNumb='" + serialNumb + '\'' +
                ", displacement=" + displacement +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", engine=" + engine +
                '}';
    }
}
