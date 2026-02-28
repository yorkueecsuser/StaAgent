import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

class XSSBug {
    protected void doGet(String badInput, PrintWriter responseWriter) {
        boolean unreachableCondition = false;
        while (unreachableCondition) {  // Unreachable while loop mutation
            System.out.println("This code is never executed.");
        }
        responseWriter.println("<html><body>" + badInput + "</body></html>"); // Original bug remains
    }

    public String showBug(String input) throws IOException {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        doGet(input, printWriter);
        return stringWriter.toString();
    }
}