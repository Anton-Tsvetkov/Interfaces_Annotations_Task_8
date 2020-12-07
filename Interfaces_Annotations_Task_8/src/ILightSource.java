public interface ILightSource {

    void on();
    void off();

    void changeLightColor(String color);
    void addLightBulb(Object object);
    void remoteLightBulb(Object object);

}
