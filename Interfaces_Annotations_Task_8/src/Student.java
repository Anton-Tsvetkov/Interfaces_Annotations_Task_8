import java.util.Arrays;

abstract public class Student implements IEnrollee{

    String name;
    String course;
    String recBookNumb;
    String groupNumb;
    int[] marks;

    int pointsSum;


    public Student(String name, String course, String recBookNumb, String groupNumb, int[] marks) {
        this.name = name;
        this.course = course;
        this.recBookNumb = recBookNumb;
        this.groupNumb = groupNumb;
        this.marks = marks;
    }

    public Student(String name, String course, String recBookNumb, String groupNumb) {
        this.name = name;
        this.course = course;
        this.recBookNumb = recBookNumb;
        this.groupNumb = groupNumb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getRecBookNumb() {
        return recBookNumb;
    }

    public void setRecBookNumb(String recBookNumb) {
        this.recBookNumb = recBookNumb;
    }

    public String getGroupNumb() {
        return groupNumb;
    }

    public void setGroupNumb(String groupNumb) {
        this.groupNumb = groupNumb;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }




    @Override
    public void submitDocs(int pointsSum){
        this.pointsSum = pointsSum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", recBookNumb='" + recBookNumb + '\'' +
                ", groupNumb='" + groupNumb + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
