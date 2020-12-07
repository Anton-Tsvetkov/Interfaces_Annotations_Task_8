public class Tram extends PublicTransport {
    public Tram(String vehModel, String routeNumb, String vehNumb, int capacity) {
        super(vehModel, routeNumb, vehNumb, capacity);
    }

    public Tram(String vehModel, String vehNumb, int capacity) {
        super(vehModel, vehNumb, capacity);
    }

    @Override
    public String toString() {
        return "Tram{" +
                "vehModel='" + vehModel + '\'' +
                ", routeNumb='" + routeNumb + '\'' +
                ", vehNumb='" + vehNumb + '\'' +
                ", capacity=" + capacity +
                ", onRoute=" + onRoute +
                ", moves=" + moves +
                '}';
    }
}
