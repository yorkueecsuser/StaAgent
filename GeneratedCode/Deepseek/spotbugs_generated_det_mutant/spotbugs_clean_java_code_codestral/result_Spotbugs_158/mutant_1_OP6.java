import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) { // Mutated: Unreachable for loop
            // This loop is unreachable because the condition is always false
        }
        throw new IOException("Simulated Server Error: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
    }

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }
}