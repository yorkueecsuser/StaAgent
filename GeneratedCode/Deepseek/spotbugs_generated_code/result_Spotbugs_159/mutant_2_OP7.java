import java.io.IOException;

class XSSVulnerableServlet {
    protected void doGet(Object request, Object response) throws IOException {
        String input = getParameter(request);  // Input from user

        // Inserted unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This code is unreachable.");
        }

        // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
        writeToResponse(response, "<html><body>Welcome, " + input + "</body></html>");
    }

    // Other methods remain unchanged
    //...
}