import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookTest {

    @Test
    public void shouldPrintBookTitleWhenPrintBookInformationIsCalled() {
        PrintStream printStream = mock(PrintStream.class);
        Book book = new Book("Title", "author", "year", printStream);
        book.printBookInformation();
        verify(printStream).println("Title | author | year");
    }
}
