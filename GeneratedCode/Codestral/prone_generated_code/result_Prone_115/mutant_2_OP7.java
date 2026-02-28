import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        BufferedReader reader = createBufferedReader(); // BUG: MustBeClosedChecker
        reader.readLine();

        // Inserted unreachable while loop
        boolean condition = getCondition();
        while (condition) {
            // Unreachable code
            System.out.println("This is an unreachable while loop.");
        }
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }

    public boolean getCondition() {
        return false;  // Always returns false to make the while loop unreachable
    }
}