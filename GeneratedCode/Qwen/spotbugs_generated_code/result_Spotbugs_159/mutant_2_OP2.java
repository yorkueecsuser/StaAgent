import java.io.IOException;

class CrossSiteScriptingServlet {
    public String showBug(String userInput) throws IOException {
        StringBuilder response = new StringBuilder();
        response.append("User Input: ").append(userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
        StringBuilder responseCopy = new StringBuilder();
        responseCopy.append("User Input: ").append(userInput); // Duplicate of the original assignment statement
        return response.toString();
    }
}