import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        BufferedReader reader = createBufferedReader(); // BUG: MustBeClosedChecker
        // Inserting unreachable for loop
        boolean conditionFor = getCondition(); // Assume getCondition() is a method that returns a boolean value
        for (int i = 0; conditionFor; i++) {
            // This block of code will never execute because the condition is false
            System.out.println("Unreachable code");
        }
        reader.readLine(); // The resource'reader' is not closed within a try-with-resources block or finally block
    }

    private boolean getCondition() {
        // Implement this method to return a boolean value
        // For the purpose of this mutation, let's assume it always returns false
        return false;
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }
}