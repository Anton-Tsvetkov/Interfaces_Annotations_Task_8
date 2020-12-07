import java.util.List;

abstract public class Player implements  ITechnics {

    String manufacturer;
    String model;
    String serialNumb;
    String color;

    boolean power;

    List<Object> recordingsList;

    public Player(String manufacturer, String model, String serialNumb, String color, List<Object> recordingsList) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.serialNumb = serialNumb;
        this.color = color;
        this.recordingsList = recordingsList;
        this.power = false;
    }

    public Player(String manufacturer, String model, String serialNumb, String color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.serialNumb = serialNumb;
        this.color = color;
        this.power = false;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumb() {
        return serialNumb;
    }

    public void setSerialNumb(String serialNumb) {
        this.serialNumb = serialNumb;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPower() {
        return power;
    }

    public List<Object> getRecordingsList() {
        return recordingsList;
    }

    @Override
    public void on() {
        this.power = true;
    }

    @Override
    public void off() {
        this.power = false;
    }

    @Override
    public void addRecording(Object object) {
        this.recordingsList.add(object);
    }

    @Override
    public void remoteRecording(Object object) {
        this.recordingsList.remove(object);
    }

    @Override
    public Object reproduction(Object obj) {
        for(Object object : recordingsList){
            if(object.hashCode() == obj.hashCode()){
                recordingsList.remove(object);
                return object;
            }
        }
        return "Object not found";
    }

    @Override
    public String toString() {
        return "Player{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", serialNumb='" + serialNumb + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", recordingsList=" + recordingsList +
                '}';
    }
}
