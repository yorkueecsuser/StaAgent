import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

class XSSBug {
    protected void doGet(String userInput, PrintWriter responseWriter) {
        responseWriter.println("<html><body>" + userInput + "</body></html>"); // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
    }

    public String showBug(String input) throws IOException {
        StringWriter stringOutput = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringOutput);
        doGet(input, printWriter);
        return stringOutput.toString();
    }
}