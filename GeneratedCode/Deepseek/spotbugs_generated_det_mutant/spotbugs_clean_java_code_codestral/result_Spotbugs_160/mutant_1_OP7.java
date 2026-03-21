import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

class XSSBug {
    private boolean alwaysFalse() {
        return false;
    }

    protected void doGet(String badInput, PrintWriter responseWriter) {
        while (alwaysFalse()) { // Mutated Code: Unreachable while loop
            System.out.println("This loop is unreachable");
        }
        responseWriter.println("<html><body>" + badInput + "</body></html>"); // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
    }

    public String showBug(String input) throws IOException {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        doGet(input, printWriter);
        return stringWriter.toString();
    }
}