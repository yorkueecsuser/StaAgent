import java.io.*;

class XSSServlet {

    public void showBug(String parameter) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        boolean ykndhjgj = false;while (ykndhjgj && true && true && false && false && false && true && true && false && true && true && false) {String qrsflexu = "gxjbswfv";}
        out.println("<p>" + parameter + "</p>"); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
    
}
}