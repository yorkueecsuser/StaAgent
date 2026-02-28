import java.io.IOException;

// Replaced unavailable imports with comments to indicate their intended use
// import javax.servlet.ServletException;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// Simulating HttpServlet and related classes
class HttpServlet {}

class HttpServletRequest {}

class HttpServletResponse {
    public java.io.PrintWriter getWriter() throws IOException {
        return new java.io.PrintWriter(System.out);
    }
}

class MutableServletExample extends HttpServlet {
    private int requestCount = 0; // BUG: Servlets should not have mutable instance fields

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        processHttpRequest(request, response);
    }

    private void processHttpRequest(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        requestCount++; // BUG: Servlets should not have mutable instance fields
        response.getWriter().println("Request count: " + requestCount);
    }

    public String showBug(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
        return "Servlet processed the request.";
    }
}