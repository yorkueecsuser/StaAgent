import java.io.IOException;
import java.io.PrintWriter;

class XSSVulnerabilityServlet {

    public void showBug(HttpServletRequestSimulator request, HttpServletResponseSimulator response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Get a parameter from the HTTP request
        String userInput = request.getParameter("userInput");
        
        // Insert an unreachable if-else statement
        boolean condition = getCondition(); // Dynamically determined at runtime
        if (condition) {
            // This block is intended to be unreachable
            out.println("<p>This is unreachable code</p>");
        } else {
            // Existing vulnerable code
            out.println("<html><body>");
            out.println("<h2>User Input: " + userInput + "</h2>"); // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
            out.println("</body></html>");
        }
    }

    private boolean getCondition() {
        return false; // Ensures the if block is never executed
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

    // Main method to demonstrate the bug
    public static void main(String[] args) throws IOException {
        XSSVulnerabilityServlet servlet = new XSSVulnerabilityServlet();
        HttpServletRequestSimulator request = new HttpServletRequestSimulator();
        HttpServletResponseSimulator response = new HttpServletResponseSimulator();
        servlet.showBug(request, response);
    }
}