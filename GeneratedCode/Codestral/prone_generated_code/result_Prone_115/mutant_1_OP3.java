import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        BufferedReader reader = createBufferedReader();
        reader.readLine();

        // Mutation Operator: Unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This code is unreachable.");
        }
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }

    // Method to return an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}