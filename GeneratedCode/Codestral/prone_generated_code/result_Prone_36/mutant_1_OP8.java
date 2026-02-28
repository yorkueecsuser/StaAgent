import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoNotMockBug {

    private BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

    public String readInput() throws IOException {
        return a.readLine();
    }

    public void showBug() throws IOException {
        System.out.println("Enter some input: ");
        String b = readInput();
        System.out.println("You entered: " + b);
    }

    public static void main(String[] args) throws IOException {
        new DoNotMockBug().showBug();
    }
}