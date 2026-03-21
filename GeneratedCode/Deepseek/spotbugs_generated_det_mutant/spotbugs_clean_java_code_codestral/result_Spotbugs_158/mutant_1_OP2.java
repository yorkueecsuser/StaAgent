import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        throw new IOException("Simulated Server Error: " + userInput);
        // Duplicate mutation
        throw new IOException("Duplicate Simulated Server Error: " + userInput);
    }

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }
}