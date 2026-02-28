import java.io.IOException;

class XssBugServlet {
    boolean getUnreachableCondition() {
        return false;
    }

    protected void doGet(String userInput) throws IOException {
        throw new IOException("Simulated Server Error: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
    }

    public String showBug(String userInput) throws IOException {
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This is an unreachable loop!");
        }

        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }
}