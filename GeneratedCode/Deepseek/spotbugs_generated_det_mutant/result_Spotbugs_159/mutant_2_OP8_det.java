import java.io.*;

class XSSServlet {
    public void doGet(String request, String response) throws Exception {
        String bbuwbftq = request.split("=")[1];
        response = "<html><body>";
        response += "Hello " + bbuwbftq; // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
        response += "</body></html>";
        System.out.println(response);
    }
    public void showBug(String request) throws Exception {
        doGet(request, "");
    }
}