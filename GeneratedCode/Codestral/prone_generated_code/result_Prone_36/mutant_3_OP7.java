import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoNotMockBug {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String readInput() throws IOException {
        while (isUnreachable()) { // Inserted unreachable while loop
            System.out.println("This is an unreachable loop");
        }
        return reader.readLine();
    }

    private boolean isUnreachable() {
        return false; // Condition to make the loop unreachable
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