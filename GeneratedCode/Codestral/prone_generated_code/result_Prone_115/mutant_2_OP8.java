import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        BufferedReader reader = createBufferedReader(); // Original code
        BufferedReader q = reader; // Mutant code: Renaming variable'reader' to 'q'
        q.readLine(); // The resource'q' is not closed within a try-with-resources block or finally block
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }
}