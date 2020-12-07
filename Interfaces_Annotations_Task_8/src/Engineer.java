abstract public class Engineer implements IEmployee{

    String name;
    String subjArea;
    int experience;

    boolean atWork;

    protected String phoneNumb;
    protected String email;

    private String medicalInsuranceNumb;
    private String salaryCardNumb;

    public Engineer(String name, String subjArea, int experience) {
        this.name = name;
        this.subjArea = subjArea;
        this.experience = experience;
        atWork = false;
    }

    public Engineer(String name, String subjArea, String phoneNumb, String email, int experience) {
        this.name = name;
        this.subjArea = subjArea;
        this.phoneNumb = phoneNumb;
        this.email = email;
        this.experience = experience;
        atWork = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjArea() {
        return subjArea;
    }

    public void setSubjArea(String subjArea) {
        this.subjArea = subjArea;
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

    public String getEmail() {
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
        return "Engineer{" +
                "name='" + name + '\'' +
                ", subjArea='" + subjArea + '\'' +
                ", experience=" + experience +
                ", atWork=" + atWork +
                ", phoneNumb='" + phoneNumb + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
