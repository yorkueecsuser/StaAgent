import java.io.IOException;

class CrossSiteScriptingServlet {
    public String showBug(String userInput) throws IOException {
        StringBuilder response = new StringBuilder();
        
        // Introduced an unreachable if statement according to the mutation operator
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            response.append("This is unreachable code.");
        }

        response.append("User Input: ").append(userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
        return response.toString();
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }
}