import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Collection;

public class Biblioteca {

    //cant instantiate a instance of Collection because its an interface
    private Collection<Book> listOfBooks;
    private PrintStream printStream;
    private WelcomeMessage welcomeMessage;
    private MainMenu mainMenu;

    public Biblioteca(Collection<Book> listOfBooks, WelcomeMessage welcomeMessage, MainMenu mainMenu, PrintStream printStream) {
        this.listOfBooks = listOfBooks;
        this.welcomeMessage = welcomeMessage;
        this.mainMenu = mainMenu;
        this.printStream = printStream;
    }

    public void listBooks() {
        for(Book book: listOfBooks) {
            book.printBookInformation();
        }
    }

    public void start() {
        welcomeMessage.displayWelcomeMessage();
        mainMenu.displayMenu();
    }


}
