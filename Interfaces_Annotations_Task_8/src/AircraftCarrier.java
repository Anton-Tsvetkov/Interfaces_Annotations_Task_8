import java.util.Arrays;

public class AircraftCarrier extends WarShip {


    Aircraft[] aircrafts;


    public AircraftCarrier(String name, String serialNumb, String homePort,
                           int displacement, int length, int width, int height,
                           Engine engine) {
        super(name, serialNumb, homePort, displacement, length, width, height, engine);
    }

    public AircraftCarrier(String name, String serialNumb, String homePort,
                           int displacement, int length, int width, int height,
                           Engine engine, Aircraft[] aircrafts) {
        super(name, serialNumb, homePort, displacement, length, width, height, engine);
        this.aircrafts = aircrafts;
    }

    public Aircraft[] getAircrafts() {
        return aircrafts;
    }

    protected void setAircrafts(Aircraft[] aircrafts) {
        this.aircrafts = aircrafts;
    }

    protected void planeToTakeOff(Aircraft aircraft, String location){
        aircraft.planeToTakeOff(aircraft, location);
    }
    protected void retPlaneToAircraftCarrier(Aircraft aircraft, String location){
        aircraft.retPlaneToAircraftCarrier(aircraft, location);
    }

    public class Aircraft {

        private String type;
        private String location;

        private int weight;
        private int length;
        private int width;
        private int height;

        private boolean onBoard;


        public Aircraft(String type, int weight, int length, int width, int height, String location, boolean onBoard) {
            this.type = type;
            this.weight = weight;
            this.length = length;
            this.width = width;
            this.height = height;
            this.location = location;
            this.onBoard = onBoard;
        }


        private void planeToTakeOff(Aircraft aircraft, String location){
            aircraft.setOnBoard(false);
            aircraft.setLocation(location);
        }

        private void retPlaneToAircraftCarrier(Aircraft aircraft, String location){
            aircraft.setOnBoard(true);
            aircraft.setLocation(location);
        }


        public String getLocation() {
            return location;
        }

        protected void setLocation(String location) {
            this.location = location;
        }

        public boolean isOnBoard() {
            return onBoard;
        }

        protected void setOnBoard(boolean onBoard) {
            this.onBoard = onBoard;
        }

        public String getType() {
            return type;
        }

        protected void setType(String type) {
            this.type = type;
        }

        public int getWeight() {
            return weight;
        }

        protected void setWeight(int weight) {
            this.weight = weight;
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


        @Override
        public String toString() {
            return "Aircraft{" +
                    "type='" + type + '\'' +
                    ", weight=" + weight +
                    ", length=" + length +
                    ", width=" + width +
                    ", height=" + height +
                    ", onBoard=" + onBoard +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AircraftCarrier{" +
                "aircrafts=" + Arrays.toString(aircrafts) +
                ", name='" + getName() + '\'' +
                ", serialNumb='" + getSerialNumb() + '\'' +
                ", displacement=" + getDisplacement() +
                ", length=" + getLength() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                ", engine=" + getEngine() +
                ", isSail=" + isSail() +
                '}';
    }
}
