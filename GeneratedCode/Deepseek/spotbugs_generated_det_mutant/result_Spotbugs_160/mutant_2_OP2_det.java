import java.io.*;

class XSSVulnerability {
public void doGet(Object request , Object response)throws Exception {
    String userInput = "dummyInput";
    userInput = "dummyInput";
    PrintWriter out = new PrintWriter(System.out);
    out.println("<html><body>");
    out.println("Your input: " + userInput);
    out.println("</body></html>");
}

    public String showBug(String userInput) {
        return "<html><body>" + "Your input: " + userInput + "</body></html>";
    }
}