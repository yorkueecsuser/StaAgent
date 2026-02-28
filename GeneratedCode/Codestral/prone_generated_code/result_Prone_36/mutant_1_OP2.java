import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoNotMockBug {

    // Mocking BufferedReader for input, which is not desirable in real scenarios
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String readInput() throws IOException {
        return reader.readLine(); // BUG: DoNotMock
    }

    public void showBug() throws IOException {
        System.out.println("Enter some input: ");
        String input = readInput();
        // Mutant: Duplicating the assignment statement
        String duplicateInput = input;
        System.out.println("You entered: " + input);
        // Using the duplicate input to print again
        System.out.println("Duplicate input: " + duplicateInput);
    }

    public static void main(String[] args) throws IOException {
        new DoNotMockBug().showBug();
    }
}