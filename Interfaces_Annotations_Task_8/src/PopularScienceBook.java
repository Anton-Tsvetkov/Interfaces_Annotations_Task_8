abstract public class PopularScienceBook extends Book{

    String subjectArea;

    public PopularScienceBook(String subjectArea, String title, String author, int pagesQuantity) {
        super(title, author, pagesQuantity);
        this.subjectArea = subjectArea;
    }

    public String getSubjectArea() {
        return subjectArea;
    }

    public void setSubjectArea(String subjectArea) {
        this.subjectArea = subjectArea;
    }

    @Override
    public String toString() {
        return "PopularScienceBook{" +
                "subjectArea='" + subjectArea + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pagesQuantity=" + pagesQuantity +
                ", year=" + year +
                ", editionNumb=" + editionNumb +
                '}';
    }
}
