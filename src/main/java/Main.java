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
        Collection<Book> checkedInBooks = new ArrayList<>();
        Collection<Book> checkedOutBooks = new ArrayList<>();
        checkedInBooks.add(new Book("Into the Wild", "John Kraukaer", "1997", printStream));
        checkedInBooks.add(new Book("Animal Farm", "George Orwell", "1934", printStream));

        return new Biblioteca(checkedInBooks, checkedOutBooks);
    }

}
