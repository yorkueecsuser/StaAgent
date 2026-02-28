import java.io.IOException;

class CrossSiteScriptingServlet {
    public String showBug(String userInput) throws IOException {
        StringBuilder response = new StringBuilder();
        
        // Dummy while loop to apply Equivalent Loop Replacement mutation operator
        int i = 0;
        while (i < 1) {
            i++;
        }
        
        // Equivalent do-while loop after mutation
        int j = 0;
        do {
            j++;
        } while (j < 1);
        
        response.append("User Input: ").append(userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
        return response.toString();
    }
}