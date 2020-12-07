public class RefBookEncyclopedia extends PopularScienceBook{

    boolean encyclopedia;
    boolean referencesBook;

    public RefBookEncyclopedia(boolean encyclopedia, String subjectArea, String title, String author, int pagesQuantity) {
        super(subjectArea, title, author, pagesQuantity);
        this.encyclopedia = encyclopedia;
        this.referencesBook = !encyclopedia;
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
                "encyclopedia=" + encyclopedia +
                ", referencesBook=" + referencesBook +
                ", subjectArea='" + subjectArea + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pagesQuantity=" + pagesQuantity +
                ", year=" + year +
                ", editionNumb=" + editionNumb +
                '}';
    }
}
