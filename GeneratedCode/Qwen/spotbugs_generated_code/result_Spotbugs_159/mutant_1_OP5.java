import java.io.IOException;

class CrossSiteScriptingServlet {
    public String showBug(String userInput) throws IOException {
        StringBuilder response = new StringBuilder();
        response.append("User Input: ").append(userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                response.append("This is unreachable code");
                break;
            case 1:
                // This case is always executed
                response.append("This is reachable code");
                break;
        }

        return response.toString();
    }

    private boolean getCondition() {
        // This method always returns false, making the switch condition always 1
        return false;
    }
}