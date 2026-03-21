import java.io.*;

class XSSServlet {

    public void showBug(String parameter) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        for  (int ysulmysm = 0; ysulmysm < 0; ysulmysm++) {short scvymqeh = 6980;}
        out.println("<p>" + parameter + "</p>"); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
    
}
}