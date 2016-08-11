import java.util.Collection;

public class Biblioteca {

    private Collection<Book> listOfBooks;

    public Biblioteca(Collection<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void listBooks() {
        for(Book book: listOfBooks) {
            book.printBookInformation();
        }
    }

}
