import java.math.BigDecimal;

public class Model extends SiemensMobile {

    String serialNumb;
    String modelName;
    BigDecimal price;
    String owner;

    public Model(String releaseDate, String color,
                 byte memorySize, byte operativeMemory,
                 int batteryCapacity, int weight,
                 double screenDiagonal, double mainCamRes, double frontCamRes,
                 String serialNumb, String modelName, BigDecimal price) {
        super(releaseDate, color, memorySize, operativeMemory, batteryCapacity, weight, screenDiagonal, mainCamRes, frontCamRes);
        this.serialNumb = serialNumb;
        this.modelName = modelName;
        this.price = price;
    }

    public Model(String color, byte memorySize, byte operativeMemory,
                 int batteryCapacity, int weight,
                 double screenDiagonal, double mainCamRes, double frontCamRes,
                 String serialNumb, String modelName, BigDecimal price) {
        super(color, memorySize, operativeMemory, batteryCapacity, weight, screenDiagonal, mainCamRes, frontCamRes);
        this.serialNumb = serialNumb;
        this.modelName = modelName;
        this.price = price;
    }

    public String getSerialNumb() {
        return serialNumb;
    }

    public void setSerialNumb(String serialNumb) {
        this.serialNumb = serialNumb;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void setOwner(String ownerName) {
        this.owner = ownerName;
    }
}
