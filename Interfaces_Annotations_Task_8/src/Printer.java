import java.util.Arrays;

abstract public class Printer implements IPrintingDevice{

    String model;
    String manufacturer;
    String weight;

    public Printer(String model, String manufacturer, String weight) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public void print(Object[] objects) {
        System.out.println("Printing " + Arrays.toString(objects) + " in process...");
    }

    @Override
    public String toString() {
        return "Printer{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
