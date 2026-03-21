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
        System.out.println("Error sent with status code: " + sc + " and message: " + msg);
    }
}

class XSSVulnerabilityExample extends HttpServlet {
public void showBug(HttpServletRequest request , HttpServletResponse response)throws IOException {
    String errorMessage = request.getParameter("error");
    errorMessage = request.getParameter("error");
    if(errorMessage != null){ response.sendError(HttpServletResponse.SC_BAD_REQUEST , errorMessage); }
}

    public static void main(String[] args) throws IOException {
        XSSVulnerabilityExample example = new XSSVulnerabilityExample();
        HttpServletRequest request = new HttpServletRequest();
        HttpServletResponse response = new HttpServletResponse();
        
        example.showBug(request, response);
    }
}