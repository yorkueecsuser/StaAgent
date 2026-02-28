import java.io.IOException;

class CrossSiteScriptingServlet {
    public String showBug(String userInput) throws IOException {
        StringBuilder response = new StringBuilder();
        response.append("User Input: ").append(userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
        return response.toString();

        // Mutated code
        StringBuilder z = new StringBuilder();
        z.append("Mutated Input: ").append(userInput);
        return z.toString();
    }
}