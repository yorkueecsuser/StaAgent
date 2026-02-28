import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        BufferedReader reader = createBufferedReader(); // BUG: MustBeClosedChecker
        reader.readLine();
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable if-else branch
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code is always executed.");
        }
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }

    private boolean getCondition() {
        return false; // always returning false to make the if-else branch unreachable
    }
}