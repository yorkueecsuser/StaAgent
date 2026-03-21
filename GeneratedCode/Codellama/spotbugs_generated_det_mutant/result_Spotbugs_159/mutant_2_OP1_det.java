import java.io.*;

class XSSServlet {

    public void showBug(String parameter) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        short pjsknvuo = -2069;
        out.println("<p>" + parameter + "</p>"); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
    
}
}