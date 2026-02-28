import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        throw new IOException("Simulated Server Error: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
    }

    public String showBug(String userInput) throws IOException {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable if branch added here
            System.out.println("This code should never execute");
        }
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }

    private boolean getCondition() {
        return false; // Always returns false for the unreachable condition
    }
}