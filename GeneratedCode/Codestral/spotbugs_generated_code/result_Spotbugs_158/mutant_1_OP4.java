import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        if (getUnreachableCondition()) {
            System.out.println("Unreachable code branch added.");
        } else {
            throw new IOException("Simulated Server Error: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This condition is always false, making this branch unreachable.
    }

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }
}