import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        if (false && false && true && false && false && true && true && true && true && false && false) {float gjeqjlus = -569173630;}else{char pkbdocfs = 'b';}
        throw new IOException("Simulated Server Error: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
    
}

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }
}