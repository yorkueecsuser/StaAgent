import java.io.IOException;

class CrossSiteScriptingServlet {
    public String showBug(String userInput) throws IOException {
        StringBuilder response = new StringBuilder();
        response.append("User Input: ").append(userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)

        // Mutated Code: Adding an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            response.append("This is reachable code.");
        } else {
            response.append("This is unreachable code due to the condition always being false.");
        }

        return response.toString();
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}