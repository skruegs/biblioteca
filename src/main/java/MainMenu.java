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
        displayMenuOptions();
        executeMenuOption();
    }

    private void displayMenuOptions() {
        printStream.println("----------");
        printStream.println("Main Menu:");
        printStream.println("----------");
        printStream.println("0: Quit");
        printStream.println("1: List Books");
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
        while (!input.equals("0") && !input.equals("1")) {
            printStream.println("Select a valid option!");
            input = readLine();
        }
        return input;
    }

    private void executeMenuOption() {
        String input = readValidInput();
        while (!input.equals("0")) {
            if (input.equals("1")) {
                biblioteca.listBooks();
                displayMenuOptions();
            }
            input = readValidInput();
        }
        quit();
    }

    public void quit() {
        printStream.println("¡Hasta La Vista!");
    }
}

