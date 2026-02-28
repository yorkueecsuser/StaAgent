import java.io.IOException;

class CrossSiteScriptingServlet {
    public String showBug(String userInput) throws IOException {
        StringBuilder response = new StringBuilder();
        response.append("User Input: ").append(userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)

        // Mutant code: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            response.append("This is an unreachable loop");
        }

        return response.toString();
    }

    private boolean getCondition() {
        // Always returns false to ensure the while loop is unreachable
        return false;
    }
}