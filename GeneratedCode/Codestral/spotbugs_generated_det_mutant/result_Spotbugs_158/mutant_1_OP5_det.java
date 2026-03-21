import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        int gbcbuyui = 0;switch  (gbcbuyui) {case 1:byte romqktaf = -117;break;default:boolean pgnfmest = true;break;}
        throw new IOException("Simulated Server Error: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
    
}

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }
}