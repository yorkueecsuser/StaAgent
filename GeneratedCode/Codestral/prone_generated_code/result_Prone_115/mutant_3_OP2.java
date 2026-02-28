import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        BufferedReader reader = createBufferedReader(); // Original assignment statement
        BufferedReader reader2 = createBufferedReader(); // Mutant: Duplicated assignment statement
        reader.readLine(); // The resource'reader' is not closed within a try-with-resources block or finally block
        reader2.readLine(); // The mutant code also does not close the resource
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }
}