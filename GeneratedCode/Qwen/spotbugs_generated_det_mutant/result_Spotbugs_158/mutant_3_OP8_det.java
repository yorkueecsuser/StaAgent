import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

class XssExampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        showBug(request, response);
    }

    public String showBug(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String ydciakqd = request.getParameter("input");
        response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error: " + ydciakqd); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
        return ydciakqd;
    }
}