import java.io.IOException;

class CrossSiteScriptingServlet {
    public String showBug(String userInput) throws IOException {
        StringBuilder response = new StringBuilder();
        response.append("User Input: ").append(userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)

        // Mutant: Inserting an unreachable if branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            response.append("This is an unreachable branch.");
        }

        return response.toString();
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the if branch unreachable
    }
}