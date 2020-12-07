import java.util.List;

abstract public class Player implements  ITechnics {

    String mark;
    String model;
    String serialNumb;
    String color;

    boolean power;

    List<Object> recordingsList;

    public Player(String mark, String model, String serialNumb, String color, List<Object> recordingsList) {
        this.mark = mark;
        this.model = model;
        this.serialNumb = serialNumb;
        this.color = color;
        this.recordingsList = recordingsList;
        this.power = false;
    }

    public Player(String mark, String model, String serialNumb, String color) {
        this.mark = mark;
        this.model = model;
        this.serialNumb = serialNumb;
        this.color = color;
        this.power = false;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
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
}
