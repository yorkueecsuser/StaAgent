import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

class XSSBug {
    protected void doGet(String badInput, PrintWriter responseWriter) {
        String renamedBadInput = badInput; // Mutant: Renamed the variable badInput to renamedBadInput
        responseWriter.println("<html><body>" + renamedBadInput + "</body></html>");
    }

    public String showBug(String input) throws IOException {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        doGet(input, printWriter);
        return stringWriter.toString();
    }
}