public abstract class Book implements IEdition{

    String title;
    String author;
    int pagesQuantity;

    int year;
    int editionNumb;

    public Book(String title, String author, int pagesQuantity) {
        this.title = title;
        this.author = author;
        this.pagesQuantity = pagesQuantity;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPagesQuantity() {
        return pagesQuantity;
    }

    public void setPagesQuantity(int pagesQuantity) {
        this.pagesQuantity = pagesQuantity;
    }

    @Override
    public void release(int year, int editionNumb) {
        this.year = year;
        this.editionNumb = editionNumb;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pagesQuantity=" + pagesQuantity +
                ", year=" + year +
                ", editionNumb=" + editionNumb +
                '}';
    }
}
