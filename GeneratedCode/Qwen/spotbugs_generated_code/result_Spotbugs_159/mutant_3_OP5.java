import java.io.IOException;

class CrossSiteScriptingServlet {
    public String showBug(String userInput) throws IOException {
        StringBuilder response = new StringBuilder();
        response.append("User Input: ").append(userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                response.append("This is never reached");
                break;
            case false:
                response.append("This is also never reached");
                break;
        }

        return response.toString();
    }

    private boolean getCondition() {
        return false; // This method ensures the switch statement is unreachable
    }
}