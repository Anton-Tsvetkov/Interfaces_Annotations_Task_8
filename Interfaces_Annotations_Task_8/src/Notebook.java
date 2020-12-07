import java.util.ArrayList;
import java.util.List;

abstract public class Notebook implements IPaper {

    String color;

    int pagesAmount;
    List<Object> notes;

    public Notebook(String color, int pagesAmount) {
        this.color = color;
        this.pagesAmount = pagesAmount;
        this.notes = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public void setPagesAmount(int pagesAmount) {
        this.pagesAmount = pagesAmount;
    }

    public List<Object> getNotes() {
        return notes;
    }

    @Override
    public void write(Object note) {
        this.notes.add(note);
    }

    @Override
    public void erase(Object note) {
        this.notes.remove(note);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "color='" + color + '\'' +
                ", pagesAmount=" + pagesAmount +
                ", notes=" + notes +
                '}';
    }
}
