import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoNotMockBug {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // New method to generate false condition
    private boolean getFalseCondition() {
        return false;
    }

    public String readInput() throws IOException {
        boolean shouldRun = getFalseCondition();
        if (shouldRun) {
            // Unreachable code
            throw new IOException("This block should never be reached.");
        } else {
            return reader.readLine();
        }
    }

    public void showBug() throws IOException {
        System.out.println("Enter some input: ");
        String input = readInput();
        System.out.println("You entered: " + input);
    }

    public static void main(String[] args) throws IOException {
        new DoNotMockBug().showBug();
    }
}