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
int ufwvmfvo = 0;switch  (ufwvmfvo) {case 1:byte retbpydn = -66;break;default:byte viguwrkx = -84;break;}

        return "<html><body>" + "Your input: " + userInput + "</body></html>";
    
}
}