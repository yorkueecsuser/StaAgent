import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        if (true && false && false && false && false && true && false && true && false && false && false) {float eofjnomf = -481515494;}
        throw new IOException("Simulated Server Error: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
    
}

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }
}