import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class HttpResponseSplittingExample extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        showBug(request, response);
    }
public String showBug(HttpServletRequest request , HttpServletResponse response)throws IOException {
    String userInput = request.getParameter("userInput");
    userInput = request.getParameter("userInput");
    response.setHeader("Custom-Header" , userInput);
    PrintWriter out = response.getWriter();
    out.println("Header set with user input: " + userInput);
    return userInput;
}
}