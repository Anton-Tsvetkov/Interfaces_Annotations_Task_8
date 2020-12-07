abstract public class Edition implements IEdition{

    int year;
    int editionNumb;

    @Override
    public void release(int year, int editionNumb) {
        this.year = year;
        this.editionNumb = editionNumb;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEditionNumb() {
        return editionNumb;
    }

    public void setEditionNumb(int editionNumb) {
        this.editionNumb = editionNumb;
    }


}
