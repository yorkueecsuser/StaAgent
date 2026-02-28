import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        throw new IOException("Simulated Server Error: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
    }

    public String showBug(String userInput) throws IOException {
        do {
            doGet(userInput);
        } while (false); // Equivalent loop replacement (original functionality maintained)

        return "Bug demonstrated with input: " + userInput;
    }
}