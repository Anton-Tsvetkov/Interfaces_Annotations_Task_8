public class Neurosurgeon extends Surgeon {

    public Neurosurgeon(String name, String department, int experience, String phoneNumb, String email) {
        super(name, department, experience, phoneNumb, email);
    }

    public Neurosurgeon(String name, String department, int experience) {
        super(name, department, experience);
    }

    @Override
    public String toString() {
        return "Neurosurgeon{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", experience=" + experience +
                ", atWork=" + atWork +
                ", phoneNumb='" + phoneNumb + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
