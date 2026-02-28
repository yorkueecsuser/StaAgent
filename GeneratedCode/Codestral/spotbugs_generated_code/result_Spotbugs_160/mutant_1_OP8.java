import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

class XSSBug {
    protected void doGet(String badInput, PrintWriter responseWriter) {
        responseWriter.println("<html><body>" + badInput + "</body></html>"); // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
    }

    public String showBug(String input) throws IOException {
        StringWriter s = new StringWriter();
        PrintWriter printWriter = new PrintWriter(s);
        doGet(input, printWriter);
        return s.toString();
    }
}