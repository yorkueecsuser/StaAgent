import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable since the condition is always false
        }
        throw new IOException("Simulated Server Error: " + userInput);
    }

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }
}