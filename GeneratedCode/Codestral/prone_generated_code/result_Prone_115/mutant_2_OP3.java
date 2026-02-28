import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        BufferedReader reader = createBufferedReader(); // BUG: MustBeClosedChecker

        // Added mutation - unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code should never be executed.");
        }

        reader.readLine(); // The resource'reader' is not closed within a try-with-resources block or finally block
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }
}