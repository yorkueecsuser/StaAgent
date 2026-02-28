import java.io.IOException;

class XssBugServlet {
    private boolean getUnreachableCondition() {
        return false;
    }

    protected void doGet(String userInput) throws IOException {
        if (getUnreachableCondition()) {
            // This condition is always false, so this block is unreachable.
            System.out.println("This is an unreachable block of code.");
        }
        throw new IOException("Simulated Server Error: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
    }

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }
}