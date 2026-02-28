import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        throw new IOException("Simulated Server Error: " + userInput); // Bug remains: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
    }

    public String showBug(String userInput) throws IOException {
        boolean conditionWhile = false;
        while (conditionWhile) { // Unreachable while loop mutation
            // This loop is unreachable as the condition is always false
        }

        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }
}