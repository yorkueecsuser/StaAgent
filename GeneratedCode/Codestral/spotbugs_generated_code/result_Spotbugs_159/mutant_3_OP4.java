import java.io.IOException;

class XSSVulnerableServlet {
    protected void doGet(Object request, Object response) throws IOException {
        String input = getParameter(request);  // Input from user

        // Inserted unreachable if-else statement
        if (getUnreachableCondition()) {
            // This branch is unreachable, so it will never execute
            System.out.println("This code will never be executed.");
        } else {
            // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
            writeToResponse(response, "<html><body>Welcome, " + input + "</body></html>");
        }
    }

    private String getParameter(Object request) {
        return request.toString();
    }

    private void writeToResponse(Object response, String data) throws IOException {
        // This method simulates the behavior of response.getWriter().write(data)
        System.out.println(data);
    }

    // Method to demonstrate the bug
    public void showBug(Object request, Object response) throws IOException {
        doGet(request, response);
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if-else statement unreachable
        return false;
    }
}