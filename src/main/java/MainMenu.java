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
        printStream.println("Enter 0 for a list of books");
    }

    private int readUserInput() {
        int input = -1;
        try {
            input = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            printStream.println("I/O Error. Could not read input.");
        } catch (NumberFormatException n){
            printStream.println("Invalid input. Please enter a number.");
        }
        return input;
    }

    private void executeMenuOption() {
        int input = readUserInput();
        if (input == 0) {
            biblioteca.listBooks();
        }
    }
}

