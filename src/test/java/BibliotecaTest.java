import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

import static org.mockito.Mockito.*;

public class BibliotecaTest {

    private Collection<Book> listOfBooks;
    private Biblioteca biblioteca;
    private Book book;

    @Before
    public void setUp() throws Exception {
        book = mock(Book.class);
        listOfBooks = new ArrayList<>();
        biblioteca = new Biblioteca(listOfBooks);
    }

    @Test
    public void shouldPrintNothingWhenThereAreNoBooks() {
        biblioteca.listBooks();
        verifyZeroInteractions(book);
    }

    @Test
    public void shouldPrintOneBookWhenThereIsOneBook() {
        listOfBooks.add(book);
        biblioteca.listBooks();
        verify(book).printBookInformation();
    }

    @Test
    public void shouldPrintMultipleBooksWhenThereAreMultipleBooks() {
        listOfBooks.add(book);
        listOfBooks.add(book);
        listOfBooks.add(book);
        biblioteca.listBooks();
        verify(book, times(3)).printBookInformation();
    }
}
