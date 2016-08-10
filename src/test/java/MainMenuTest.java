import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MainMenuTest {

    private PrintStream printStream;
    private MainMenu mainMenu;
    private BufferedReader reader;
    private Biblioteca biblioteca;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        reader = mock(BufferedReader.class);
        biblioteca = mock(Biblioteca.class);
        mainMenu = new MainMenu(printStream, reader, biblioteca);
        when(reader.readLine()).thenReturn("0");
    }

    @Test
    public void shouldPrintWelcomeWhenMenuStarts() {
        mainMenu.start();
        verify(biblioteca).displayWelcomeMessage();
    }

    @Test
    public void shouldPrintMenuOptionsWhenMenuStarts() {
        mainMenu.start();
        verify(printStream).println("Enter 0 for a list of books");
    }

    @Test
    public void shouldListBooksWhenChoiceIsZero() {
        mainMenu.start();
        verify(biblioteca).listBooks();

    }

}