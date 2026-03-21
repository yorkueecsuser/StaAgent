// XssVulnerableServlet.java
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class XssVulnerableServlet {

    public void doGet(String errorMessage) throws IOException {
        HttpServletResponse response = new HttpServletResponseWrapper(new HttpServletResponse() {
            @Override
            public void sendError(int sc, String msg) throws IOException {
                // Not implemented for this example
            }
        });
        response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, errorMessage);
    }

    public String showBug(String errorMessage) throws IOException {
        doGet(errorMessage);
        return HttpServletResponse.SC_INTERNAL_SERVER_ERROR + " " + errorMessage;
    }

    private static class HttpServletResponseWrapper extends HttpServletResponse {
        public HttpServletResponseWrapper(HttpServletResponse response) {
            super(response);
        }
        @Override
        public void sendError(int sc, String msg) throws IOException {
            // Not implemented for this example
        }
    }
}