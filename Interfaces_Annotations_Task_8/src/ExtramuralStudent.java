import java.util.Arrays;

public class ExtramuralStudent extends Student{


    public ExtramuralStudent(String name, String course, String recBookNumb, String groupNumb, int[] marks) {
        super(name, course, recBookNumb, groupNumb, marks);
    }

    public ExtramuralStudent(String name, String course, String recBookNumb, String groupNumb) {
        super(name, course, recBookNumb, groupNumb);
    }



    @Override
    public String toString() {
        return "ExtramuralStudent{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", recBookNumb='" + recBookNumb + '\'' +
                ", groupNumb='" + groupNumb + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
