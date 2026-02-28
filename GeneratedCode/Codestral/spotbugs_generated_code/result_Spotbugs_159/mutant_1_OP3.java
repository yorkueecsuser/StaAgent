import java.io.IOException;

class XSSVulnerableServlet {
    protected void doGet(Object request, Object response) throws IOException {
        String input = getParameter(request);  // Input from user

        // Added mutant code based on Unreachable if statement
        boolean unreachable = getCondition();
        if (unreachable) {
            System.out.println("This code is unreachable.");
        }

        // Original bug remains
        writeToResponse(response, "<html><body>Welcome, " + input + "</body></html>");
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

    // Method to simulate an unreachable condition
    private boolean getCondition() {
        return false;
    }
}