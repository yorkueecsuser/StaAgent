import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        boolean muwhxlns = false;while (muwhxlns && false && true && true && true && true && false && false && false && true && true && false) {long pmjjneyl = -926726903;}
        throw new IOException("Simulated Server Error: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
    
}

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }
}