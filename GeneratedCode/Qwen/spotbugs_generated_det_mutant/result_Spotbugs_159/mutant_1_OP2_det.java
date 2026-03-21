import java.io.IOException;

class CrossSiteScriptingServlet {
public String showBug(String userInput)throws IOException {
    StringBuilder response = new StringBuilder();
    response = new StringBuilder();
    response.append("User Input: " ).append(userInput);
    return response.toString();
}
}