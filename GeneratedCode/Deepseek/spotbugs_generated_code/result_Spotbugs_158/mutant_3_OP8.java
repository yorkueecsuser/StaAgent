import java.io.IOException;

class XssBugServlet {
    protected void doGet(String x) throws IOException {
        throw new IOException("Simulated Server Error: " + x); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
    }

    public String showBug(String y) throws IOException {
        doGet(y);
        return "Bug demonstrated with input: " + y;
    }
}