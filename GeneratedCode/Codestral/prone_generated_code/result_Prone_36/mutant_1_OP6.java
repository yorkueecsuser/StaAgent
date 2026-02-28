import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoNotMockBug {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String readInput() throws IOException {
        boolean unreachableCondition = false;
        for (int i = 0; i < 1 && unreachableCondition; i++) { // Mutation: Unreachable for loop
            System.out.println("This line should never be executed.");
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