import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        BufferedReader reader = createBufferedReader(); // BUG: MustBeClosedChecker
        reader.readLine(); // The resource'reader' is not closed within a try-with-resources block or finally block

        // Unreachable if statement mutant
        if (alwaysFalse()) {
            // This branch is unreachable
            System.out.println("This line should never be executed.");
        }
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }

    // Function that always returns false
    private boolean alwaysFalse() {
        return false;
    }
}