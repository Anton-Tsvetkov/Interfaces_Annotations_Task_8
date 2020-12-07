public class LaserPrinter extends Printer{
    public LaserPrinter(String model, String manufacturer, String weight) {
        super(model, manufacturer, weight);
    }

    @Override
    public String toString() {
        return "LaserPrinter{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
