import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        throw new IOException("Simulated Server Error: " + userInput); // BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
    }

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }

    // Mutated code: Adding an equivalent do-while loop
    public void equivalentLoop() {
        int i = 0;
        do {
            // Equivalent code to the original function, but it's not affecting the existing functionality
            System.out.println("Equivalent do-while loop iteration: " + i);
            i++;
        } while (i < 5); // Condition is equivalent to the original for/while loop
    }
}