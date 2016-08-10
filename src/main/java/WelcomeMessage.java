import java.io.PrintStream;

public class WelcomeMessage {

    private PrintStream printStream;

    public WelcomeMessage(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void displayWelcomeMessage() {
        String message = "Hello and welcome to Biblioteca!";
        printStream.println(message);
    }
}
