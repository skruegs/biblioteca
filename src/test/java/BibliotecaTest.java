import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

import static org.mockito.Mockito.*;

public class BibliotecaTest {


    private Collection<String> listOfBooks;
    private PrintStream printStream;
    private Biblioteca biblioteca;

    @Before
    public void setUp() throws Exception {
        listOfBooks = new ArrayList<>();
        printStream = mock(PrintStream.class);
        biblioteca = new Biblioteca(printStream, listOfBooks);
    }

    @Test
    public void shouldPrintNothingWhenThereAreNoBooks() {
        biblioteca.listBooks();
        verifyZeroInteractions(printStream);
    }

    @Test
    public void shouldPrintOneBookWhenThereIsOneBook() {
        listOfBooks.add("Book Title");
        biblioteca.listBooks();
        verify(printStream).println("Book Title");
    }

    @Test
    public void shouldPrintMultipleBooksWhenThereAreMultipleBooks() {
        listOfBooks.add("BookTitleOne");
        listOfBooks.add("BookTitleOne");
        biblioteca.listBooks();
        verify(printStream, atLeast(2)).println("BookTitleOne");
    }
}
