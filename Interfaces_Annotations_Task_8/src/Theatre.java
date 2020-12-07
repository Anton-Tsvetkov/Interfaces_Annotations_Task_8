public class Theatre extends PublicBuilding{

    String name;
    int seatsAmount;

    public Theatre(String address, int floorAmount, double square, String name, int seatsAmount) {
        super(address, floorAmount, square);
        this.name = name;
        this.seatsAmount = seatsAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public void setSeatsAmount(int seatsAmount) {
        this.seatsAmount = seatsAmount;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "name='" + name + '\'' +
                ", seatsAmount=" + seatsAmount +
                ", address='" + address + '\'' +
                ", floorAmount=" + floorAmount +
                ", square=" + square +
                '}';
    }
}
