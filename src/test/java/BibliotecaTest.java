import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;

public class BibliotecaTest {

    private Collection<Book> checkedInBooks;
    private Collection<Book> checkedOutBooks;
    private Biblioteca biblioteca;
    private Book book;

    @Before
    public void setUp() throws Exception {
        book = mock(Book.class);
        checkedInBooks = new ArrayList<>();
        checkedOutBooks = new ArrayList<>();

        biblioteca = new Biblioteca(checkedInBooks, checkedOutBooks);
    }

    @Test
    public void shouldPrintNothingWhenThereAreNoBooks() {
        biblioteca.listBooks();
        verifyZeroInteractions(book);
    }

    @Test
    public void shouldPrintOneBookWhenThereIsOneBook() {
        checkedInBooks.add(book);

        biblioteca.listBooks();
        verify(book).printBookInformation();
    }

    @Test
    public void shouldPrintMultipleBooksWhenThereAreMultipleBooks() {
        checkedInBooks.add(book);
        checkedInBooks.add(book);
        checkedInBooks.add(book);

        biblioteca.listBooks();
        verify(book, times(3)).printBookInformation();
    }

    @Test
    public void shouldRemoveBookFromCheckedInListWhenCheckOutCalled() throws Exception {
        checkedInBooks.add(book);

        when(book.isThisYourTitle("")).thenReturn(true);
        biblioteca.checkOut("");

        assertFalse(checkedInBooks.contains(book));
    }


}
