import java.util.Arrays;

public class Costume extends Clothes{
    public Costume(String title, String color, String design, String style, String[] dimensions) {
        super(title, color, design, style, dimensions);
    }

    @Override
    public String toString() {
        return "Costume{" +
                "title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", design='" + design + '\'' +
                ", style='" + style + '\'' +
                ", dimensions=" + Arrays.toString(dimensions) +
                '}';
    }
}
