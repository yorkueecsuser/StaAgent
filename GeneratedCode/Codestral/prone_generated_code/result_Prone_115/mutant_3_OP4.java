import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        BufferedReader reader = createBufferedReader(); // BUG: MustBeClosedChecker
        reader.readLine();

        // Unreachable if-else statement mutant:
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch is always unreachable because the condition is dynamically determined at runtime
            // and it can never be true in this context
        } else {
            // This code is unreachable as per the mutation operator
            int unreachableValue = 10;
            System.out.println("Unreachable code: " + unreachableValue);
        }
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }

    private boolean getCondition() {
        // This method should return a condition that is always false in this context
        // For the purpose of this mutation, we will return false directly
        return false;
    }
}