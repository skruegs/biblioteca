import java.util.Collection;

public class Biblioteca {

    //cant instantiate a instance of Collection because its an interface
    private Collection<Book> listOfBooks;
    private WelcomeMessage welcomeMessage;

    public Biblioteca(Collection<Book> listOfBooks, WelcomeMessage welcomeMessage) {
        this.listOfBooks = listOfBooks;
        this.welcomeMessage = welcomeMessage;
    }

    public void listBooks() {
        for(Book book: listOfBooks) {
            book.printBookInformation();
        }
    }

    public void displayWelcomeMessage() {
        welcomeMessage.displayWelcomeMessage();
    }

}
