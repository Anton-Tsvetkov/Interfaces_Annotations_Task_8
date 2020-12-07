import java.util.Arrays;

abstract public class Clothes implements ICloth {

    String title;
    String color;
    String design;
    String style;

    String[] dimensions;

    public Clothes(String title, String color, String design, String style, String[] dimensions) {
        this.title = title;
        this.color = color;
        this.design = design;
        this.style = style;
        this.dimensions = dimensions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public void sew(String[] dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", design='" + design + '\'' +
                ", style='" + style + '\'' +
                ", dimensions=" + Arrays.toString(dimensions) +
                '}';
    }
}
