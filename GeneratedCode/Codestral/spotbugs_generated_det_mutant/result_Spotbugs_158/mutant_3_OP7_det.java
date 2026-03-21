import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        boolean jzezyhni = false;while (jzezyhni && false && false && true && false && true && true && false && false && false && false && false) {int sntrbdsf = 244024372;}
        throw new IOException("Simulated Server Error: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
    
}

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }
}