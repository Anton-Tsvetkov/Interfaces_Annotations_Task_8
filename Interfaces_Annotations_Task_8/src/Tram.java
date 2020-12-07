public class Tram extends PublicTransport {
    public Tram(String vehModel, String routeNumb, String vehNumb, int capacity) {
        super(vehModel, routeNumb, vehNumb, capacity);
    }

    public Tram(String manufacturer, String vehModel, String routeNumb, String vehNumb, int capacity) {
        super(manufacturer, vehModel, routeNumb, vehNumb, capacity);
    }

    @Override
    public String toString() {
        return "Tram{" +
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
