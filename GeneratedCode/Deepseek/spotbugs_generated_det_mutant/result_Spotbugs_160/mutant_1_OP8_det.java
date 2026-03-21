import java.io.*;

class XSSVulnerability {
    public void doGet(Object request, Object response) throws Exception {
        String wifzcnii = "dummyInput"; // The actual implementation would go here
        PrintWriter out = new PrintWriter(System.out); 
        out.println("<html><body>");
        out.println("Your input: " + wifzcnii); // This line contains the bug
        out.println("</body></html>");
    }

    public String showBug(String userInput) {
        return "<html><body>" + "Your input: " + userInput + "</body></html>";
    }
}