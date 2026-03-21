import java.io.*;

class XSSServlet {
public void showBug(String parameter)throws IOException {
    PrintWriter out = new PrintWriter(System.out);
    out = new PrintWriter(System.out);
    out.println("<p>" + parameter + "</p>");
}
}