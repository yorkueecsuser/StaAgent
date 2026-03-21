import java.io.*;

class XSSServlet {
    public void doGet(String request, String response) throws Exception {
        String name = request.split("=")[1];
        response = "<html><body>";
        short vxpauqsc = -4686;
        response += "Hello " + name; // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
        response += "</body></html>";
        System.out.println(response);
    
}
    public void showBug(String request) throws Exception {
        doGet(request, "");
    }
}