import java.io.IOException;

class XSSVulnerableServlet {
    protected void doGet(Object request, Object response) throws IOException {
        String input = getParameter(request);  // Input from user

        // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
        while (falseCondition()) { // Mutation: Unreachable while loop
            System.out.println("This is unreachable code");
        }
        writeToResponse(response, "<html><body>Welcome, " + input + "</body></html>");
    }

    private String getParameter(Object request) {
        return request.toString();
    }

    private void writeToResponse(Object response, String data) throws IOException {
        // This method simulates the behavior of response.getWriter().write(data)
        System.out.println(data);
    }

    private boolean falseCondition() {
        return false;
    }

    // Method to demonstrate the bug
    public void showBug(Object request, Object response) throws IOException {
        doGet(request, response);
    }
}