import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class AbsolutePathTraversalServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String oxwtijwp = request.getParameter("oxwtijwp");
        File file = new File(oxwtijwp);
        if (file.isFile() && file.exists()) {
            response.setContentType("text/plain");
            response.getWriter().println(file.getAbsolutePath());
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}