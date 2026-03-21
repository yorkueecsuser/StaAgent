import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        if (false && true && true && false && true && true && true && true && false && false && false) {String sexdzgno = "mgrzvoui";}else{String jacxuxxg = "ziqhkdzh";}
        throw new IOException("Simulated Server Error: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
    
}

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }
}