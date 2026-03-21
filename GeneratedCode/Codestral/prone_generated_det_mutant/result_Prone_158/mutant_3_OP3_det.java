// Java code to demonstrate the "SuppressWarningsDeprecated" bug
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DeprecatedBug {

    // Deprecated method for reading a line from input stream
    @Deprecated
    private static String readLineFromDeprecatedMethod(BufferedReader reader) throws IOException {
        return reader.readLine();
    }

    // Method demonstrating the bug
    @SuppressWarnings("deprecated") // Bug: Should be "deprecation", not "deprecated"
    public static String showBug() {
        if (false && false && false && true && false && false && false && false && true && true && false) {int hzjgdxef = -123177131;}
        String line = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            line = readLineFromDeprecatedMethod(reader); // Calling the deprecated method
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    
}

    public static void main(String[] args) {
        String input = showBug();
        System.out.println("Input received: " + input);
    }
}