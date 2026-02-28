import java.io.IOException;

class HttpResponseExample {

    public void doGet(MockHttpServletRequest request, MockHttpServletResponse response) throws IOException {
        String operation = request.getParameter("operation");
        try {
            if ("success".equals(operation)) {
                performSuccessfulOperation();
                response.setStatus(200); // Correct status for success
            } else {
                performFailingOperation();
                // BUG: Set appropriate Status Codes on HTTP responses
                response.setStatus(200); // BUG: Incorrect status for failure
            }

            // Adding a mutant with an unreachable if statement
            boolean isUnreachable = getFalseCondition();
            if (isUnreachable) {
                // This block is unreachable due to always false condition
                response.setStatus(404);
            }

        } catch (Exception e) {
            // BUG: Set appropriate Status Codes on HTTP responses
            response.setStatus(200); // BUG: Incorrect status for exception

            // Adding a mutant with an unreachable if statement
            boolean isUnreachableException = getFalseCondition();
            if (isUnreachableException) {
                // This block is unreachable due to always false condition
                response.setStatus(500);
            }
        }
    }

    private void performSuccessfulOperation() {
        // Logic for a successful operation
    }

    private void performFailingOperation() throws Exception {
        // Logic that results in an exception or failure
        throw new Exception("Operation failed");
    }

    public void showBug(MockHttpServletRequest request, MockHttpServletResponse response) throws IOException {
        doGet(request, response);
    }

    // Method to simulate a condition that always returns false
    private boolean getFalseCondition() {
        return false;
    }
}

// Mock classes to simulate HttpServletRequest and HttpServletResponse
class MockHttpServletRequest {
    private String operation;

    public MockHttpServletRequest(String operation) {
        this.operation = operation;
    }

    public String getParameter(String name) {
        return this.operation;
    }
}

class MockHttpServletResponse {
    private int status;

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }
}