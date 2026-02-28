import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoNotMockBug {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // Method to always return false
    private boolean alwaysFalse() {
        return false;
    }

    public String readInput() throws IOException {
        // Inserted unreachable while loop
        while (alwaysFalse()) {
            System.out.println("Unreachable code");
        }
        return reader.readLine();
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