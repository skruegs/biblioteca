import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) throws Exception {
        MainMenu mainMenu = initializeMainMenu();
        mainMenu.start();
    }

    private static MainMenu initializeMainMenu() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return new MainMenu(System.out, reader, initializeBiblioteca());
    }

    private static Biblioteca initializeBiblioteca() {
        PrintStream printStream = new PrintStream(System.out);
        Collection<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Into the Wild", "John Kraukaer", "1997", printStream));
        listOfBooks.add(new Book("Animal Farm", "George Orwell", "1934", printStream));

        return new Biblioteca(listOfBooks, initializeWelcomeMessage(printStream));
    }

    private static WelcomeMessage initializeWelcomeMessage(PrintStream printStream) {
        return new WelcomeMessage(printStream);
    }
}
