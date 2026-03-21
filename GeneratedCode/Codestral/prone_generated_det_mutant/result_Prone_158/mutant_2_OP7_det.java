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
        boolean bufkshzm = false;while (bufkshzm && false && true && true && false && false && true && false && false && false && false && false) {String agcvddal = "hufujwqz";}
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