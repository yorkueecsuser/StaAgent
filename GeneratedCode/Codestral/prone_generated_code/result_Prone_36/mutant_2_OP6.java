import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoNotMockBug {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String readInput() throws IOException {
        boolean neverTrue = getCondition();
        for (int i = 0; neverTrue; i++) {
            System.out.println("This loop is unreachable.");
        }
        return reader.readLine();
    }

    private boolean getCondition() {
        return false;
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