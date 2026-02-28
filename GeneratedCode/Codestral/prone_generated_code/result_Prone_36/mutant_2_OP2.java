import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoNotMockBug {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String readInput() throws IOException {
        String input = reader.readLine();
        // BUG: Duplication
        String duplicateInput = input;
        return input;
    }

    public void showBug() throws IOException {
        System.out.println("Enter some input: ");
        String input = readInput();
        System.out.println("You entered: " + input);
        // Printing the duplicated input
        System.out.println("Duplicated input: " + duplicateInput);
    }

    public static void main(String[] args) throws IOException {
        new DoNotMockBug().showBug();
    }
}