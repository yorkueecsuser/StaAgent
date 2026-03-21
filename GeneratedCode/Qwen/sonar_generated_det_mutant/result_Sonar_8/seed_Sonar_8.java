import java.io.IOException;

class StatusCodeBugExample {

    public String showBug() throws IOException {
        StringBuilder responseMessage = new StringBuilder();
        try {
            // Simulate a successful operation
            boolean operationSuccess = true; // This should be determined by actual logic

            if (operationSuccess) {
                responseMessage.append("Operation succeeded");
                // BUG: Set appropriate Status Codes on HTTP responses
                responseMessage.append(" Status Code: ").append(200); // Correct, but for demonstration purposes, let's assume it's incorrect
            } else {
                responseMessage.append("Operation failed");
                // BUG: Set appropriate Status Codes on HTTP responses
                responseMessage.append(" Status Code: ").append(200); // Incorrect, should be a 4xx or 5xx code
            }
        } catch (Exception e) {
            responseMessage.append("An error occurred: ").append(e.getMessage());
            // BUG: Set appropriate Status Codes on HTTP responses
            responseMessage.append(" Status Code: ").append(200); // Incorrect, should be a 4xx or 5xx code
        }
        return responseMessage.toString();
    }

    public static void main(String[] args) {
        // This main method is just for demonstration and won't work without a proper HttpServletResponse object
        try {
            StatusCodeBugExample example = new StatusCodeBugExample();
            System.out.println(example.showBug()); // This will print the result with the incorrect status code
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}