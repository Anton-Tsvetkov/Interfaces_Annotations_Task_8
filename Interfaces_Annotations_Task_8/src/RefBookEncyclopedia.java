public class RefBookEncyclopedia extends Book {

    String subjectArea;

    boolean encyclopedia;
    boolean referencesBook;

    public RefBookEncyclopedia(String title, String author, int pagesQuantity, String subjectArea, boolean encyclopedia) {
        super(title, author, pagesQuantity);
        this.subjectArea = subjectArea;
        this.encyclopedia = encyclopedia;
    }

    public boolean isRefBook(){
        return referencesBook;
    }

    public boolean isEncyclopedia(){
        return encyclopedia;
    }

    public void setEncyclopedia(boolean encyclopedia) {
        this.encyclopedia = encyclopedia;
        this.referencesBook = !encyclopedia;
    }

    public void setReferencesBook(boolean referencesBook) {
        this.referencesBook = referencesBook;
        this.encyclopedia = !referencesBook;
    }

    public void refBookANDEncyclopedia(){
        this.referencesBook = true;
        this.encyclopedia = true;
    }

    @Override
    public String toString() {
        return "RefBookEncyclopedia{" +
                "subjectArea='" + subjectArea + '\'' +
                ", encyclopedia=" + encyclopedia +
                ", referencesBook=" + referencesBook +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pagesQuantity=" + pagesQuantity +
                ", year=" + year +
                ", editionNumb=" + editionNumb +
                '}';
    }
}
