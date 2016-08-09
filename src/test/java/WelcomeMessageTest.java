import org.junit.Test;

import static org.mockito.Mockito.mock;

import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
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
