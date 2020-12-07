import java.util.Arrays;

public class TableLamp extends Lamp{
    public TableLamp(String manufacturer, String corpColor, String lightColor, int maxLampsAmount, int lampsAmount) {
        super(manufacturer, corpColor, lightColor, maxLampsAmount, lampsAmount);
    }

    @Override
    public String toString() {
        return "TableLamp{" +
                "manufacturer='" + manufacturer + '\'' +
                ", corpColor='" + corpColor + '\'' +
                ", lightColor='" + lightColor + '\'' +
                ", maxLampsAmount=" + maxLampsAmount +
                ", lampsAmount=" + lampsAmount +
                ", lightBulbs=" + Arrays.toString(lightBulbs) +
                ", power=" + power +
                '}';
    }
}
