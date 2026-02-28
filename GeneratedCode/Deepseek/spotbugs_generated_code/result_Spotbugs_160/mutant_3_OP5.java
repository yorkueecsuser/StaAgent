import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

class XSSBug {
    // Method to always return a false condition
    private boolean getFalseCondition() {
        return false;
    }

    protected void doGet(String badInput, PrintWriter responseWriter) {
        responseWriter.println("<html><body>" + badInput + "</body></html>"); // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)

        // Mutated code: introduce an unreachable switch statement
        boolean shouldSwitch = getFalseCondition();
        if (shouldSwitch) {
            int value = 1; // This value won't be used as the condition is always false
            switch (value) {
                case 1:
                    System.out.println("This code is unreachable due to the false condition.");
                    break;
                default:
                    break;
            }
        }
    }

    public String showBug(String input) throws IOException {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        doGet(input, printWriter);
        return stringWriter.toString();
    }
}