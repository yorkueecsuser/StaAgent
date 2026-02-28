import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoNotMockBug {

    // Mocking BufferedReader for input, which is not desirable in real scenarios
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private boolean isFalse() {
        return false;
    }

    public String readInput() throws IOException {
        if (isFalse()) {
            System.out.println("This code should never be reached.");
        }
        return reader.readLine(); // BUG: DoNotMock
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