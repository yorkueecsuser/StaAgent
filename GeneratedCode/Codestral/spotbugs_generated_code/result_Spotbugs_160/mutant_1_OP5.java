import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

class XSSBug {
    protected void doGet(String badInput, PrintWriter responseWriter) {
        int unreachableValue = getUnreachableValue(); // Added a method to get an unreachable value
        switch (unreachableValue) { // Inserted an unreachable switch statement
            case 1:
                // This code is unreachable
                break;
            default:
                // This code is unreachable as well
                break;
        }
        responseWriter.println("<html><body>" + badInput + "</body></html>"); // Original bug is maintained
    }

    public String showBug(String input) throws IOException {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        doGet(input, printWriter);
        return stringWriter.toString();
    }

    private int getUnreachableValue() {
        return 2; // This value is not used in the switch statement, so it's unreachable
    }
}