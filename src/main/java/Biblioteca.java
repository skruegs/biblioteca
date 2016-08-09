import java.io.PrintStream;
import java.util.Collection;

public class Biblioteca {
    private PrintStream printStream;

    //cant instantiate a instance of Collection because its an interface
    private Collection<String> listOfBooks;

    public Biblioteca(PrintStream printStream, Collection<String> listOfBooks) {
        this.printStream = printStream;
        this.listOfBooks = listOfBooks;
    }


    public void listBooks() {
        for(String bookTitle: listOfBooks) {
            printStream.println(bookTitle);
        }
    }
}
