import java.io.*;

class XSSServlet {

    public void showBug(String parameter) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        if (false && true && true && false && true && true && true && false && false && false && false) {short jiwsaqjl = 7472;}
        out.println("<p>" + parameter + "</p>"); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
    
}
}