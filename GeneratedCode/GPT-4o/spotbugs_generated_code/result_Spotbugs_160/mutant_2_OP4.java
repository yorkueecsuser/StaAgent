import java.io.IOException;
import java.io.PrintWriter;

class XSSVulnerabilityServlet {

    public void showBug(HttpServletRequestSimulator request, HttpServletResponseSimulator response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Unreachable if-else statement
        boolean condition = getCondition(); // This method will return a non-final variable
        if (condition) {
            out.println("This will never be printed.");
        } else {
            out.println("This is the else branch of an unreachable if-else statement.");
        }

        // Get a parameter from the HTTP request
        String userInput = request.getParameter("userInput");
        
        // Directly use the user input in the HTML output
        out.println("<html><body>");
        out.println("<h2>User Input: " + userInput + "</h2>"); // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        out.println("</body></html>");
    }

    // Simulators for HttpServletRequest and HttpServletResponse
    static class HttpServletRequestSimulator {
        public String getParameter(String name) {
            return "<script>alert('XSS');</script>";
        }
    }

    static class HttpServletResponseSimulator {
        public void setContentType(String type) {
            // Simulate setting content type
        }

        public PrintWriter getWriter() {
            return new PrintWriter(System.out, true);
        }
    }

    // Method to simulate condition for unreachable statement
    private boolean getCondition() {
        return false;
    }

    // Main method to demonstrate the bug
    public static void main(String[] args) throws IOException {
        XSSVulnerabilityServlet servlet = new XSSVulnerabilityServlet();
        HttpServletRequestSimulator request = new HttpServletRequestSimulator();
        HttpServletResponseSimulator response = new HttpServletResponseSimulator();
        servlet.showBug(request, response);
    }
}