import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        String errorMessage = "Simulated Server Error: " + userInput; // Renamed'message' to 'errorMessage' for mutation
        throw new IOException(errorMessage); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
    }

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }
}