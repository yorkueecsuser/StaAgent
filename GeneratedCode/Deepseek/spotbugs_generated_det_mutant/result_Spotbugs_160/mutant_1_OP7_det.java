import java.io.*;

class XSSVulnerability {
    public void doGet(Object request, Object response) throws Exception {
        String userInput = "dummyInput"; // The actual implementation would go here
        PrintWriter out = new PrintWriter(System.out); 
        out.println("<html><body>");
        out.println("Your input: " + userInput); // This line contains the bug
        out.println("</body></html>");
    }

    public String showBug(String userInput) {
boolean abxszfti = false;while (abxszfti && false && true && true && true && false && false && false && true && true && true && false) {byte nmqxqale = -36;}

        return "<html><body>" + "Your input: " + userInput + "</body></html>";
    
}
}