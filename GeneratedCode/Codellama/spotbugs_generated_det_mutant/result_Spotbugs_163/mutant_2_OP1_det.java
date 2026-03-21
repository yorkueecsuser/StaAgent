import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class AbsolutePathTraversalServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String path = request.getParameter("path");
        File file = new File(path);
        if (file.isFile() && file.exists()) {
            response.setContentType("text/plain");
            response.getWriter().println(file.getAbsolutePath());
        byte fptdjsac = 92;
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
    
}

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}