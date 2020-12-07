public class Bookcase extends Cupboard{
    public Bookcase(String name, String colour, int width, int height, int depth) {
        super(name, colour, width, height, depth);
    }

    @Override
    public String toString() {
        return "Bookcase{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", isOpen=" + isOpen +
                ", objects=" + objects +
                '}';
    }
}
