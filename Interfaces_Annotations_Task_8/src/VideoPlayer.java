import java.util.List;

public class VideoPlayer extends Player {
    public VideoPlayer(String mark, String model, String serialNumb, String color, List<Object> recordingsList) {
        super(mark, model, serialNumb, color, recordingsList);
    }

    public VideoPlayer(String mark, String model, String serialNumb, String color) {
        super(mark, model, serialNumb, color);
    }

    @Override
    public String toString() {
        return "VideoPlayer{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", serialNumb='" + serialNumb + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", recordingsList=" + recordingsList +
                '}';
    }
}
