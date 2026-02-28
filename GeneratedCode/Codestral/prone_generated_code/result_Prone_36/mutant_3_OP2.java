import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoNotMockBug {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String readInput() throws IOException {
        return reader.readLine(); // BUG: DoNotMock
    }

    public void showBug() throws IOException {
        System.out.println("Enter some input: ");
        String input = readInput();
        String duplicatedInput = input; // Apply Duplication mutation operator
        System.out.println("You entered: " + input);
        System.out.println("Duplicated input: " + duplicatedInput); // Print duplicated input
    }

    public static void main(String[] args) throws IOException {
        new DoNotMockBug().showBug();
    }
}