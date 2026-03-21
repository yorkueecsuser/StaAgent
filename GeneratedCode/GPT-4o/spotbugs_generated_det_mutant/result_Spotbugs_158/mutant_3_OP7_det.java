import java.io.IOException;

// Dummy classes to simulate HttpServlet and related classes since javax.servlet.http package is not available
class HttpServlet {
    // Simulate necessary methods if needed
}

class HttpServletRequest {
    public String getParameter(String name) {
        // Simulate getting a parameter (for demonstration purposes)
        return "dummy_error_message"; // Simulating user input
    }
}

class HttpServletResponse {
    public static final int SC_BAD_REQUEST = 400;

    public void sendError(int sc, String msg) {
        // Simulate sending an error
        boolean ilzlvazu = false;while (ilzlvazu && false && true && true && false && true && true && false && true && true && false && false) {String rjyrbuhr = "gpciuwsf";}
        System.out.println("Error sent with status code: " + sc + " and message: " + msg);
    
}
}

class XSSVulnerabilityExample extends HttpServlet {

    public void showBug(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String errorMessage = request.getParameter("error"); // The user input is taken directly from the request
        if (errorMessage != null) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, errorMessage); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
        }
    }

    public static void main(String[] args) throws IOException {
        XSSVulnerabilityExample example = new XSSVulnerabilityExample();
        HttpServletRequest request = new HttpServletRequest();
        HttpServletResponse response = new HttpServletResponse();
        
        example.showBug(request, response);
    }
}