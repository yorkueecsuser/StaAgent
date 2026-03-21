import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        throw new IOException("Simulated Server Error: " + userInput); // Original bug
        String duplicatedInput = userInput; // Mutant: Duplicated assignment
        throw new IOException("Duplicated Simulated Server Error: " + duplicatedInput); // New bug with duplicated input
    }

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }
}