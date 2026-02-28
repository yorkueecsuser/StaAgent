import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        BufferedReader reader = createBufferedReader(); // BUG: MustBeClosedChecker
        reader.readLine(); // The resource'reader' is not closed within a try-with-resources block or finally block

        // Mutation Operator: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code block will never be executed due to the condition being false at runtime
            // But, it is added to maintain the original structure of the code
        }
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }

    private boolean getCondition() {
        // The implementation of this method will determine the condition for the while loop
        // In this case, we're simply returning false to ensure the loop is unreachable
        return false;
    }
}