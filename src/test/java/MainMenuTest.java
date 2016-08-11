import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

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
    public void shouldPrintWelcomeMessageWhenMenuStarts() throws IOException{
        when(reader.readLine()).thenReturn("1", "0");
        mainMenu.start();
        verify(printStream).println("Hello and welcome to Biblioteca!");
    }

    @Test
    public void shouldPrintMenuOptionsWhenMenuStarts() throws IOException {
        when(reader.readLine()).thenReturn("1", "0");
        mainMenu.start();
        verify(printStream, times(2)).println("Main Menu:");
    }

    @Test
    public void shouldPrintQuitMessageWhenChoiceIsZero() throws IOException {
        when(reader.readLine()).thenReturn("s", "1", "0");
        mainMenu.start();
        verify(printStream).println("¡Hasta la vista!");
    }

    @Test
    public void shouldListBooksWhenChoiceIsOne() throws IOException {
        when(reader.readLine()).thenReturn("1", "0");
        mainMenu.start();
        verify(biblioteca).listBooks();
    }

    @Test
    public void shouldCheckOutBookWhenChoiceIsTwo() throws IOException {
        String bookTitle = "";
        when(reader.readLine()).thenReturn("2", bookTitle, "0");
        mainMenu.start();
        verify(biblioteca).checkOut(bookTitle);
    }

    @Test
    public void shouldNotifyUserIfInputIsInvalid() throws IOException {
        when(reader.readLine()).thenReturn("s", "1", "0");
        mainMenu.start();
        verify(biblioteca).listBooks();
    }
}