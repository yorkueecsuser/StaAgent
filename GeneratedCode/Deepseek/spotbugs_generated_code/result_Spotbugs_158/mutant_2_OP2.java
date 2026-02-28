import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        throw new IOException("Simulated Server Error: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
        throw new IOException("Duplicated Error: " + userInput); // Mutant code: Duplicate the line that throws the IOException
    }

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }
}