import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract public class Lamp implements ILightSource{

    String manufacturer;
    String corpColor;
    String lightColor;

    int maxLampsAmount;
    int lampsAmount;

    Object[] lightBulbs;

    boolean power;

    public Lamp(String manufacturer, String corpColor, String lightColor, int maxLampsAmount, int lampsAmount) {
        this.manufacturer = manufacturer;
        this.corpColor = corpColor;
        this.lightColor = lightColor;
        this.maxLampsAmount = maxLampsAmount;
        this.lampsAmount = lampsAmount;
        this.power = false;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCorpColor() {
        return corpColor;
    }

    public String getLightColor() {
        return lightColor;
    }

    public Object[] getLightBulbs() {
        return lightBulbs;
    }

    public boolean isPower() {
        return power;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCorpColor(String corpColor) {
        this.corpColor = corpColor;
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
    public void addLightBulb(Object object) {
        for(Object obj : lightBulbs){
            if(obj == null) obj = object;
        }
    }

    @Override
    public void remoteLightBulb(Object object) {
        for(Object obj : lightBulbs){
            if(obj == object) obj = null;
        }
    }

    @Override
    public void changeLightColor(String color) {
        this.lightColor = color;
    }

    @Override
    public String toString() {
        return "Lamp{" +
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
