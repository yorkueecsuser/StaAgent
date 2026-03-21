import java.io.*;

class XSSServlet {

    public void showBug(String parameter) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        if (true && false && false && true && true && true && false && true && true && true && false) {float btgetsbc = 428262485;}else{char dcgecuzm = 'j';}
        out.println("<p>" + parameter + "</p>"); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
    
}
}