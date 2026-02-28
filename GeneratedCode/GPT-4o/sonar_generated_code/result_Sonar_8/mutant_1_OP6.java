import java.io.IOException;

class HttpResponseExample {

    public void doGet(MockHttpServletRequest request, MockHttpServletResponse response) throws IOException {
        String operation = request.getParameter("operation");
        try {
            if ("success".equals(operation)) {
                performSuccessfulOperation();
                response.setStatus(200); // Correct status for success

                // Inserting unreachable for loop
                boolean conditionFor = getCondition();
                for (int i = 0; conditionFor; i++) {
                    // Unreachable code block
                    System.out.println("This loop is unreachable.");
                }
            } else {
                performFailingOperation();
                // BUG: Set appropriate Status Codes on HTTP responses
                response.setStatus(200); // BUG: Incorrect status for failure

                // Inserting unreachable for loop
                boolean conditionFor = getCondition();
                for (int i = 0; conditionFor; i++) {
                    // Unreachable code block
                    System.out.println("This loop is unreachable.");
                }
            }
        } catch (Exception e) {
            // BUG: Set appropriate Status Codes on HTTP responses
            response.setStatus(200); // BUG: Incorrect status for exception

            // Inserting unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // Unreachable code block
                System.out.println("This loop is unreachable.");
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

    // Method to return a condition for the loops
    private boolean getCondition() {
        return false; // Always returns false to ensure the loop is unreachable
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