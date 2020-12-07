public class Book extends Edition{

    String title;
    String author;
    int pagesQuantity;


    public Book(String title, String author, int pagesQuantity) {
        this.title = title;
        this.author = author;
        this.pagesQuantity = pagesQuantity;
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
