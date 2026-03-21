import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        int tujnbkto = 0;switch  (tujnbkto) {case 1:int pwztknxn = 178446720;break;default:short ogshszfe = 969;break;}
        throw new IOException("Simulated Server Error: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
    
}

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }
}