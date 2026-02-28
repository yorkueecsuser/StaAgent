import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

class XSSBug {
    protected void doGet(String badInput, PrintWriter responseWriter) {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) { // Unreachable loop inserted here
            // This loop is unreachable as the condition is always false
        }
        responseWriter.println("<html><body>" + badInput + "</body></html>"); // Bug: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
    }

    public String showBug(String input) throws IOException {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        doGet(input, printWriter);
        return stringWriter.toString();
    }
}