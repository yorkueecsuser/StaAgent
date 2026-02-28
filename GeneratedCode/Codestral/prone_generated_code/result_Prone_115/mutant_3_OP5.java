import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        BufferedReader reader = createBufferedReader(); // BUG: MustBeClosedChecker
        reader.readLine(); // The resource'reader' is not closed within a try-with-resources block or finally block

        // Mutant code added below
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This code block is unreachable as the switch condition always evaluates to false
                System.out.println("This is an unreachable code block");
                break;
        }
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }

    private int getUnreachableValue() {
        // this method always returns a value that is not 1, ensuring the switch statement is unreachable
        return 0;
    }
}