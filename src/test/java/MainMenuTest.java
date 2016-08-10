import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainMenuTest {

    private PrintStream printStream;
    private MainMenu mainMenu;
    private BufferedReader reader;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        reader = mock(BufferedReader.class);
        mainMenu = new MainMenu(printStream, reader);
    }

    @Test
    public void printMenu() {
        mainMenu.displayMenu();
        verify(printStream).println("Main Menu:");
    }

    @Test
    public void shouldPrintMenuOptions() {
        mainMenu.displayMenu();
        verify(printStream).println("Enter 0 for a list of books:");
    }

    @Test
    public void shouldTakeUserInputAfterDisplayingMenu() throws IOException {
        mainMenu.readUserInput();
        verify(reader).readLine();
    }

}