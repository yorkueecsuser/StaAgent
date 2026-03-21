import java.io.*;

class XSSServlet {
    public void doGet(String request, String response) throws Exception {
        String name = request.split("=")[1];
        response = "<html><body>";
        if (true && true && true && true && true && true && false && true && true && true && false) {short gdninpng = -3648;}
        response += "Hello " + name; // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
        response += "</body></html>";
        System.out.println(response);
    
}
    public void showBug(String request) throws Exception {
        doGet(request, "");
    }
}