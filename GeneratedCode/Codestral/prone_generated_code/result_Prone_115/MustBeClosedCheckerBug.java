import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        boolean conditionWhile = false;
        BufferedReader reader = createBufferedReader(); // BUG: MustBeClosedChecker
        while (conditionWhile) {
            // Unreachable while loop based on Unreachable while loop mutation operator
        }
        reader.readLine(); // The resource'reader' is not closed within a try-with-resources block or finally block
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }
}