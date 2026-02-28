import java.io.IOException;

class XSSVulnerableServlet {
    protected void doGet(Object request, Object response) throws IOException {
        String userInput = getParameter(request);  // Input from user

        // Bug remains: XSS: Servlet reflected cross site scripting vulnerability
        writeToResponse(response, "<html><body>Welcome, " + userInput + "</body></html>");
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
}