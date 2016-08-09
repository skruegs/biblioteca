import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Collection<String> listOfBooks = new ArrayList<>();
        listOfBooks.add("Into The Wild");
        PrintStream printStream = new PrintStream(System.out);
        Biblioteca biblioteca = new Biblioteca(printStream, listOfBooks);
        WelcomeMessage newMessage = new WelcomeMessage(printStream);
        newMessage.displayWelcomeMessage();
        biblioteca.listBooks();
    }
}