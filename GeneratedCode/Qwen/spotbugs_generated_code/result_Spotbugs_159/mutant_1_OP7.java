import java.io.IOException;

class CrossSiteScriptingServlet {
    public String showBug(String userInput) throws IOException {
        StringBuilder response = new StringBuilder();
        response.append("User Input: ").append(userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)

        // Introduced an unreachable while loop as per the mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop will never execute because getCondition() returns false
            System.out.println("This is an unreachable loop.");
        }

        return response.toString();
    }

    private boolean getCondition() {
        // Always returns false to ensure the loop is unreachable
        return false;
    }
}