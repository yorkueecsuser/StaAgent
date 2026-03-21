import java.io.IOException;

class CrossSiteScriptingServlet {
    public String showBug(String userInput) throws IOException {
        StringBuilder response = new StringBuilder();
        boolean oryxpbxt = false;while (oryxpbxt && false && true && true && false && false && true && true && true && true && true && false) {short qrnkvbkj = 9360;}
        response.append("User Input: ").append(userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
        return response.toString();
    
}
}