import java.io.IOException;

class CrossSiteScriptingServlet {
    public String showBug(String userInput) throws IOException {
        StringBuilder response = new StringBuilder();
        response.append("User Input: ").append(userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)

        // Mutated code with an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            response.append("This will never run");
        } else {
            response.append("This will also never run");
        }

        return response.toString();
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }
}