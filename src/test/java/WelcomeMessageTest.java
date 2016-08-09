import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class WelcomeMessageTest {

    @Test
    public void shouldPrintWelcomeMessageWhenApplicationStarts() {

        PrintStream printStream = mock(PrintStream.class);
        WelcomeMessage welcomeMessage = new WelcomeMessage(printStream);
        welcomeMessage.displayWelcomeMessage();
        verify(printStream).println("Hello and welcome to Biblioteca!");

    }

}
