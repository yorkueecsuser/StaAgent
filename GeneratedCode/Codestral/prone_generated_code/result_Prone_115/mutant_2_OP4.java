import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        BufferedReader reader = createBufferedReader(); // BUG: MustBeClosedChecker
        reader.readLine(); // The resource'reader' is not closed within a try-with-resources block or finally block

        // Mutation Operator: Unreachable if-else statement
        boolean condition = false;
        if (condition) {
            // This branch is unreachable and added to introduce a mutant
            System.out.println("Unreachable code executed");
        } else {
            // This is the else branch of the unreachable if statement
            // Any code in this branch can be considered as a mutant
        }
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }

    // Method to simulate a dynamic condition for the mutation operator
    private boolean getCondition() {
        return false;
    }
}