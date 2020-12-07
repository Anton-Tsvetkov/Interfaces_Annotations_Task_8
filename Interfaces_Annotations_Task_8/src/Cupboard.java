import java.util.ArrayList;
import java.util.List;

abstract public class Cupboard implements IFurniture{

    String name;
    String colour;
    int width;
    int height;
    int depth;

    boolean isOpen;

    List<Object> objects;

    public Cupboard(String name, String colour, int width, int height, int depth) {
        this.name = name;
        this.colour = colour;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.objects = new ArrayList<>();
        this.isOpen = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

    @Override
    public void open() {
        isOpen = true;
    }

    @Override
    public void close() {
        isOpen = false;
    }

    @Override
    public void putObject(Object obj) {
        this.objects.add(obj);
    }

    @Override
    public Object takeObject(Object obj) {
        for(Object object : objects){
            if(object.hashCode() == obj.hashCode()){
                objects.remove(object);
                return object;
            }
        }
        return "Object not found";
    }
}
