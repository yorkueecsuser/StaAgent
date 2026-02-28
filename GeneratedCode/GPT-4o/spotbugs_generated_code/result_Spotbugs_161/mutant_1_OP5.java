import java.io.IOException;

// Simplified version without specific javax.servlet.http imports
class HttpResponseSplittingExample {

    public void doGet(MockHttpServletRequest request, MockHttpServletResponse response) throws IOException {
        String userInput = request.getParameter("input");
        showBug(response, userInput);
        
        // Unreachable switch statement mutation 
        int unreachableValue = getUnreachableValue(); // This is a method to ensure the value is dynamically determined
        switch (unreachableValue) {
            case 1:
                System.out.println("This code is unreachable.");
                break;
            default:
                // Default case also unreachable
                break;
        }
    }

    public void showBug(MockHttpServletResponse response, String headerValue) throws IOException {
        // Directly using user input in the response header can lead to HTTP response splitting
        response.addHeader("Custom-Header", headerValue); // BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
        response.getWriter().println("Header set with user input.");
    }
    
    // Helper method to provide a switch condition value
    private int getUnreachableValue() {
        return 0; // Always returns 0, making the switch cases unreachable
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