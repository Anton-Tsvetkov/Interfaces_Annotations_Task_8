abstract public class SiemensMobile implements IMobile{

    String releaseDate;
    String color;

    byte memorySize;
    byte operativeMemory;

    int batteryCapacity;
    int weight;

    double screenDiagonal;
    double mainCamRes;
    double frontCamRes;

    boolean power;

    public SiemensMobile(String releaseDate, String color,
                         byte memorySize, byte operativeMemory,
                         int batteryCapacity, int weight,
                         double screenDiagonal, double mainCamRes, double frontCamRes) {
        this.releaseDate = releaseDate;
        this.color = color;
        this.memorySize = memorySize;
        this.operativeMemory = operativeMemory;
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
        this.screenDiagonal = screenDiagonal;
        this.mainCamRes = mainCamRes;
        this.frontCamRes = frontCamRes;
        this.power = false;
    }

    public SiemensMobile(String color, byte memorySize, byte operativeMemory,
                         int batteryCapacity, int weight,
                         double screenDiagonal, double mainCamRes, double frontCamRes) {
        this.color = color;
        this.memorySize = memorySize;
        this.operativeMemory = operativeMemory;
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
        this.screenDiagonal = screenDiagonal;
        this.mainCamRes = mainCamRes;
        this.frontCamRes = frontCamRes;
        this.power = false;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(byte memorySize) {
        this.memorySize = memorySize;
    }

    public byte getOperativeMemory() {
        return operativeMemory;
    }

    public void setOperativeMemory(byte operativeMemory) {
        this.operativeMemory = operativeMemory;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public double getMainCamRes() {
        return mainCamRes;
    }

    public void setMainCamRes(double mainCamRes) {
        this.mainCamRes = mainCamRes;
    }

    public double getFrontCamRes() {
        return frontCamRes;
    }

    public void setFrontCamRes(double frontCamRes) {
        this.frontCamRes = frontCamRes;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }


    @Override
    public void on() {
        power = true;
    }

    @Override
    public void off() {
        power = false;
    }

    @Override
    public String toString() {
        return "SiemensMobile{" +
                "releaseDate='" + releaseDate + '\'' +
                ", color='" + color + '\'' +
                ", memorySize=" + memorySize +
                ", operativeMemory=" + operativeMemory +
                ", batteryCapacity=" + batteryCapacity +
                ", weight=" + weight +
                ", screenDiagonal=" + screenDiagonal +
                ", mainCamRes=" + mainCamRes +
                ", frontCamRes=" + frontCamRes +
                ", power=" + power +
                '}';
    }
}
