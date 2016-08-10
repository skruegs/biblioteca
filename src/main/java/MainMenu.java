import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class MainMenu {

    private PrintStream printStream;
    private BufferedReader reader;


    public MainMenu(PrintStream printStream, BufferedReader reader) {
        this.printStream = printStream;
        this.reader = reader;
    }

    public void displayMenu() {
        printStream.println("Main Menu:");
        displayMenuOptions();
    }

    private void displayMenuOptions() {
        printStream.println("Enter 0 for a list of books:");
    }

    public void readUserInput() throws IOException {
        try {
            reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

