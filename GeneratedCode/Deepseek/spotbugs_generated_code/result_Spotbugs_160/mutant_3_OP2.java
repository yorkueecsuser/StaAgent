import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

class XSSBug {
    protected void doGet(String badInput, PrintWriter responseWriter) {
        responseWriter.println("<html><body>" + badInput + "</body></html>"); // Original assignment statement
        responseWriter.println("<html><body>" + badInput + "</body></html>"); // Duplicated assignment statement
    }

    public String showBug(String input) throws IOException {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        doGet(input, printWriter);
        return stringWriter.toString();
    }
}