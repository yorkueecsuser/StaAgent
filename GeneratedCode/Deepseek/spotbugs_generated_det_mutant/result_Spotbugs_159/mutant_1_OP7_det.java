import java.io.*;

class XSSServlet {
    public void doGet(String request, String response) throws Exception {
        String name = request.split("=")[1];
        response = "<html><body>";
        boolean rarjdlmo = false;while (rarjdlmo && false && false && true && false && false && true && false && false && false && false && false) {boolean dhozofin = false;}
        response += "Hello " + name; // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
        response += "</body></html>";
        System.out.println(response);
    
}
    public void showBug(String request) throws Exception {
        doGet(request, "");
    }
}