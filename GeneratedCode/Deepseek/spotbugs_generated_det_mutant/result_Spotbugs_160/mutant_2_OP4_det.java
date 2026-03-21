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
if (false && true && false && true && true && true && true && true && false && false && false) {short jrkynfqv = -338;}else{double uxcbkhxl = 350034362;}

        return "<html><body>" + "Your input: " + userInput + "</body></html>";
    
}
}