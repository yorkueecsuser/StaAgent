import java.io.IOException;

class CrossSiteScriptingServlet {
    public String showBug(String userInput) throws IOException {
        StringBuilder response = new StringBuilder();
        response.append("User Input: ").append(userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)

        // Mutant code: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will always return false
            response.append("This is an unreachable loop iteration: ").append(i);
        }

        return response.toString();
    }

    private boolean getCondition() {
        // This method always returns false, making the loop condition always false
        return false;
    }
}