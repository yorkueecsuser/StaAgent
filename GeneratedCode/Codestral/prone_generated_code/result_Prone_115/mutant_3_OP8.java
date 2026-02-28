import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        BufferedReader reader = createBufferedReader(); // BUG: MustBeClosedChecker
        reader.readLine(); // The resource'reader' is not closed within a try-with-resources block or finally block

        // Mutated Java code added based on the Renaming mutation operator
        BufferedReader r = reader; // New variable 'r' is renamed from'reader'
        r.readLine(); // Using the renamed variable 'r'
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }
}