import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoNotMockBug {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String readInput() throws IOException {
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This code is unreachable.");
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

    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the loop unreachable
    }
}