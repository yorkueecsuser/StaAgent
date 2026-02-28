import java.io.IOException;

// Simplified version without specific javax.servlet.http imports
class HttpResponseSplittingExample {

    public void doGet(MockHttpServletRequest request, MockHttpServletResponse response) throws IOException {
        String userInput = request.getParameter("input");
        
        boolean condition = getCondition(); // Introduced non-final variable for condition
        if (condition) {
            System.out.println("This code is unreachable.");
        }
        
        showBug(response, userInput);
    }

    public void showBug(MockHttpServletResponse response, String headerValue) throws IOException {
        // Directly using user input in the response header can lead to HTTP response splitting
        response.addHeader("Custom-Header", headerValue); // BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
        response.getWriter().println("Header set with user input.");
    }

    // Method to ensure the condition in if statement is dynamically determined at runtime
    private boolean getCondition() {
        return false; // Always returns false, making the if block unreachable
    }
}

// Mock classes to simulate HttpServletRequest and HttpServletResponse
class MockHttpServletRequest {
    public String getParameter(String name) {
        return "userInput"; // Mocked user input
    }
}

class MockHttpServletResponse {
    public void addHeader(String name, String value) {
        // Simulate adding a header
        System.out.println("Header added: " + name + " = " + value);
    }

    public PrintWriter getWriter() {
        return new PrintWriter(System.out);
    }
}

// Mock implementation of PrintWriter
class PrintWriter {
    private final java.io.PrintStream out;

    public PrintWriter(java.io.PrintStream out) {
        this.out = out;
    }

    public void println(String x) {
        out.println(x);
    }
}