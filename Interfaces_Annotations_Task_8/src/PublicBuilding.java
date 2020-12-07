abstract public class PublicBuilding implements Building {

    String address;
    int floorAmount;
    double square;

    private boolean open;

    public PublicBuilding(String address, int floorAmount, double square) {
        this.address = address;
        this.floorAmount = floorAmount;
        this.square = square;
        this.open = false;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloorAmount() {
        return floorAmount;
    }

    public void setFloorAmount(int floorAmount) {
        this.floorAmount = floorAmount;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    @Override
    public void open() {
        this.open = true;
    }

    @Override
    public void closed() {
        this.open = false;
    }
}
