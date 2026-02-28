import java.io.IOException;

class StatusCodeBugExample {

    public String showBug() throws IOException {
        StringBuilder responseContent = new StringBuilder();
        try {
            // Simulate a successful operation
            boolean operationSuccessful = true;

            if (operationSuccessful) {
                responseContent.append("Operation successful");
                // Correct status code
            } else {
                responseContent.append("Operation failed");
                // Correct status code
            }

            // Simulate an exception
            throw new RuntimeException("Simulated exception");

        } catch (Exception e) {
            responseContent.append("An error occurred: ").append(e.getMessage());
            // BUG: Set appropriate Status Codes on HTTP responses
            // Incorrect status code
        }
        return responseContent.toString();
    }
}