import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        BufferedReader reader = createBufferedReader(); // BUG: MustBeClosedChecker

        boolean unreachableCondition = false;
        for(int i = 0; unreachableCondition; i++) { // Inserted unreachable for loop
            System.out.println("This line will never be executed.");
        }

        reader.readLine(); // The resource'reader' is not closed within a try-with-resources block or finally block
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }

    private boolean getCondition() { // Dummy method to ensure no compile-time constant is used
        return false;
    }
}