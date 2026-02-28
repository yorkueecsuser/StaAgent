import java.io.IOException;

class CrossSiteScriptingServlet {
    public String showBug(String userInput) throws IOException {
        StringBuilder response = new StringBuilder();
        
        // Mutated code: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            response.append("This is a reachable part of the code.");
        } else {
            response.append("This is an unreachable part of the code due to the condition.");
        }

        response.append("User Input: ").append(userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
        return response.toString();
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the else block unreachable
    }
}