import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

class XSSBug {
    protected void doGet(String badInput, PrintWriter responseWriter) {
        responseWriter.println("<html><body>" + badInput + "</body></html>"); // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)

        // Mutated code: Unreachable if-else statement
        if (isUnreachableCondition()) {
            System.out.println("This code is unreachable.");
        } else {
            // This branch is unreachable
            responseWriter.println("<script>alert('This is an unreachable script tag.');</script>");
        }
    }

    public String showBug(String input) throws IOException {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        doGet(input, printWriter);
        return stringWriter.toString();
    }

    private boolean isUnreachableCondition() {
        return false; // This method always returns false to make the if branch unreachable
    }
}