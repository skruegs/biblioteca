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
        biblioteca.displayWelcomeMessage();
        displayMenu();
        executeMenuOption();
    }
    private void displayMenu() {
        printStream.println("Main Menu:");
        displayMenuOptions();
    }

    private void displayMenuOptions() {
        printStream.println("0: List Books");
    }

    private String readLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            printStream.println("I/O Error. Could not read input.");
        }
        return null;
    }

    private String readValidInput() {
        String input = readLine();
        while (!input.equals("0")) {
            printStream.println("Select a valid option!");
            input = readLine();
        }
        return input;
    }

    private void executeMenuOption() {
        readValidInput();
        biblioteca.listBooks();

    }
}

