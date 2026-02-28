import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoNotMockBug {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String readInput() throws IOException {
        // Inserted unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This line is unreachable.");
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

    // Method to return a false condition
    private boolean getUnreachableCondition() {
        return false;
    }
}