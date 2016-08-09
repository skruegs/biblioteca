import java.io.PrintStream;
import java.util.Collection;

public class Biblioteca {

    //cant instantiate a instance of Collection because its an interface
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
