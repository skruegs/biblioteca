import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class MainMenu {

    private PrintStream printStream;
    private BufferedReader reader;
    private Biblioteca biblioteca;

    public MainMenu(PrintStream printStream, BufferedReader reader, Biblioteca biblioteca) {
        this.printStream = printStream;
        this.reader = reader;
        this.biblioteca = biblioteca;
    }

    public void start() {
        displayWelcomeMessage();
        displayMenuOptions();
        executeMenuOption();
    }

    private void displayWelcomeMessage() {
        printStream.println("Hello and welcome to Biblioteca!");
    }

    private void displayMenuOptions() {
        printStream.println("----------");
        printStream.println("Main Menu:");
        printStream.println("----------");
        printStream.println("0: Quit");
        printStream.println("1: List books");
        printStream.println("2: Check out a book");
    }

    private String readLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            printStream.println("I/O Error. Could not read input.");
        }
        return null;
    }

    private void executeMenuOption() {
        String input = readLine();
        while (!input.equals("0")) {
            if (input.equals("1")) {
                biblioteca.listBooks();
            } else if (input.equals("2")) {
                printStream.println("Enter title to check out:");
                String bookTitle = readLine();
                biblioteca.checkOut(bookTitle);
            } else {
                printStream.println("Select a valid option!");
            }
            displayMenuOptions();
            input = readLine();
        }
        displayQuitMessage();
    }

    private void displayQuitMessage() {
        printStream.println("¡Hasta la vista!");
    }
}

