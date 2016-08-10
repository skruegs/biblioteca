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
    }

    @Test
    public void shouldPrintWelcomeWhenMenuStarts() throws IOException {
        when(reader.readLine()).thenReturn("0");
        mainMenu.start();
        verify(biblioteca).displayWelcomeMessage();
    }

    @Test
    public void shouldPrintMenuOptionsWhenMenuStarts() throws IOException {
        when(reader.readLine()).thenReturn("0");
        mainMenu.start();
        verify(printStream).println("0: List Books");
    }

    @Test
    public void shouldListBooksWhenChoiceIsZero() throws IOException {
        when(reader.readLine()).thenReturn("0");
        mainMenu.start();
        verify(biblioteca).listBooks();
    }

    @Test
    public void shouldNotifyUserIfInputIsInvalid() throws IOException {
        when(reader.readLine()).thenReturn("s", "0");
        mainMenu.start();
        verify(biblioteca).listBooks();
    }
}