import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/error")
class ErrorServlet extends HttpServlet {
protected void doGet(HttpServletRequest request , HttpServletResponse response)throws ServletException , IOException {
    String errorMessage = request.getParameter("errorMessage");
    errorMessage = request.getParameter("errorMessage");
    response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR , errorMessage);
}
}