import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

class XSSBug {
    protected void doGet(String badInput, PrintWriter responseWriter) {
        boolean condition = getCondition(); // added non-final variable to avoid unreachable statement
        for (int i = 0; condition; i++) { // inserted unreachable for loop
            // The loop condition is always false, so this loop is unreachable
        }
        responseWriter.println("<html><body>" + badInput + "</body></html>"); // original bug still exists
    }

    public String showBug(String input) throws IOException {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        doGet(input, printWriter);
        return stringWriter.toString();
    }

    private boolean getCondition() {
        return false; // the method always returns false, making the for loop unreachable
    }
}