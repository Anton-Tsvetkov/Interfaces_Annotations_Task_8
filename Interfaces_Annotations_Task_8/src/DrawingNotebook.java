public class DrawingNotebook extends Notebook {
    public DrawingNotebook(String color, int pagesAmount) {
        super(color, pagesAmount);
    }

    @Override
    public String toString() {
        return "DrawingNotebook{" +
                "color='" + color + '\'' +
                ", pagesAmount=" + pagesAmount +
                ", notes=" + notes +
                '}';
    }
}
