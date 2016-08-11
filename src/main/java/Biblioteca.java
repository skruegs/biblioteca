import java.util.Collection;
import java.util.Iterator;

public class Biblioteca {

    private Collection<Book> checkedInBooks;
    private Collection<Book> checkedOutBooks;

    public Biblioteca(Collection<Book> checkedInBooks, Collection<Book> checkedOutBooks) {
        this.checkedInBooks = checkedInBooks;
        this.checkedOutBooks = checkedOutBooks;
    }

    public void listBooks() {
        for(Book book: checkedInBooks) {
            book.printBookInformation();
        }
    }

    public void checkOut(String bookTitle) {
        for (Book book : checkedInBooks) {
            if (book.isThisYourTitle(bookTitle)) {
                checkedInBooks.remove(book);
                break;
            }
        }
    }
}
