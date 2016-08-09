import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        Collection<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Into the Wild", "John Kraukaer", "1997", printStream));
        listOfBooks.add(new Book("1984", "George Orwell", "1934", printStream));

        Biblioteca biblioteca = new Biblioteca(listOfBooks);
        WelcomeMessage newMessage = new WelcomeMessage(printStream);
        newMessage.displayWelcomeMessage();
        biblioteca.listBooks();
    }
}