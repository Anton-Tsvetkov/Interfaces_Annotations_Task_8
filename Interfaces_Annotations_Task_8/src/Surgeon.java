abstract public class Surgeon implements IDoctor {

    String name;
    String department;

    int experience;

    boolean atWork;

    protected String phoneNumb;
    protected String email;

    private String medicalInsuranceNumb;
    private String salaryCardNumb;

    public Surgeon(String name, String department, int experience, String phoneNumb, String email) {
        this.name = name;
        this.department = department;
        this.experience = experience;
        this.phoneNumb = phoneNumb;
        this.email = email;
        this.atWork = false;
    }

    public Surgeon(String name, String department, int experience) {
        this.name = name;
        this.department = department;
        this.experience = experience;
        this.atWork = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isAtWork() {
        return atWork;
    }

    public void setAtWork(boolean atWork) {
        this.atWork = atWork;
    }

    protected String getPhoneNumb() {
        return phoneNumb;
    }

    protected void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected String getMedicalInsuranceNumb() {
        return medicalInsuranceNumb;
    }

    protected void setMedicalInsuranceNumb(String medicalInsuranceNumb) {
        this.medicalInsuranceNumb = medicalInsuranceNumb;
    }

    protected String getSalaryCardNumb() {
        return salaryCardNumb;
    }

    protected void setSalaryCardNumb(String salaryCardNumb) {
        this.salaryCardNumb = salaryCardNumb;
    }

    @Override
    public void work() {
        this.atWork = true;
    }

    @Override
    public void goHome() {
        this.atWork = false;
    }

    @Override
    public String toString() {
        return "Surgeon{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", experience=" + experience +
                ", atWork=" + atWork +
                ", phoneNumb='" + phoneNumb + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
