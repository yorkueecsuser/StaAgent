import java.io.IOException;

class CrossSiteScriptingServlet {
    public String showBug(String userInput) throws IOException {
        StringBuilder response = new StringBuilder();
        
        // Adding a dummy loop for mutation
        int i = 0;
        while (i < 1) {
            response.append("User Input: ").append(userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
            i++;
        }

        // Applying Equivalent Loop Replacement
        int j = 0;
        do {
            response.append("User Input: ").append(userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
            j++;
        } while (j < 1);

        return response.toString();
    }
}