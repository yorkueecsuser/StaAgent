import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Unreachable loop
            System.out.println("This loop will never execute");
        }
        throw new IOException("Simulated Server Error: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
    }

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }

    // Method to simulate a runtime condition
    private boolean getCondition() {
        return false;
    }
}