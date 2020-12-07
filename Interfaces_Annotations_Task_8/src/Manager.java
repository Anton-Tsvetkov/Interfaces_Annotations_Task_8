public class Manager extends Engineer{

    String departmentLed;

    public Manager(String name, String subjArea, int experience, String departmentLed) {
        super(name, subjArea, experience);
        this.departmentLed = departmentLed;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "departmentLed='" + departmentLed + '\'' +
                ", name='" + name + '\'' +
                ", subjArea='" + subjArea + '\'' +
                ", experience=" + experience +
                ", atWork=" + atWork +
                '}';
    }
}
