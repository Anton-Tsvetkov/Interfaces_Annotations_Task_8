abstract public class PublicTransport implements IVehicle {

    String manufacturer;
    String vehModel;
    String routeNumb;
    String vehNumb;
    int capacity;

    boolean onRoute;
    boolean moves;

    public PublicTransport(String manufacturer, String vehModel, String vehNumb, int capacity) {
        this.manufacturer = manufacturer;
        this.vehModel = vehModel;
        this.vehNumb = vehNumb;
        this.capacity = capacity;
        this.onRoute = false;
        this.moves = false;
    }

    public PublicTransport(String manufacturer, String vehModel, String routeNumb, String vehNumb, int capacity) {
        this.manufacturer = manufacturer;
        this.vehModel = vehModel;
        this.routeNumb = routeNumb;
        this.vehNumb = vehNumb;
        this.capacity = capacity;
        this.onRoute = false;
        this.moves = false;
    }

    void getONRoute(){
        this.onRoute = true;
    }
    void getOFFRoute(){
        this.onRoute = false;
    }

    public String getVehModel() {
        return vehModel;
    }

    public void setVehModel(String vehModel) {
        this.vehModel = vehModel;
    }

    public String getRouteNumb() {
        return routeNumb;
    }

    public void setRouteNumb(String routeNumb) {
        this.routeNumb = routeNumb;
    }

    public String getVehNumb() {
        return vehNumb;
    }

    public void setVehNumb(String vehNumb) {
        this.vehNumb = vehNumb;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isOnRoute() {
        return onRoute;
    }

    public boolean isMoves() {
        return moves;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void go() {
        this.moves = true;
    }

    @Override
    public void stop() {
        this.moves = false;
    }

    @Override
    public String toString() {
        return "PublicTransport{" +
                "manufacturer='" + manufacturer + '\'' +
                ", vehModel='" + vehModel + '\'' +
                ", routeNumb='" + routeNumb + '\'' +
                ", vehNumb='" + vehNumb + '\'' +
                ", capacity=" + capacity +
                ", onRoute=" + onRoute +
                ", moves=" + moves +
                '}';
    }
}
