import java.io.*;

class XSSServlet {

    public void showBug(String parameter) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        boolean kzpwqxrd = false;while (kzpwqxrd && true && false && false && false && true && true && false && true && false && false && false) {long tqznzbta = 121433083;}
        out.println("<p>" + parameter + "</p>"); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
    
}
}