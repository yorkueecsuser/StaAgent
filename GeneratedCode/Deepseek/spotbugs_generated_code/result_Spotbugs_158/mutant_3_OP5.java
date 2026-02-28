import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        boolean alwaysFalse = getCondition(); // Always returns false
        switch (alwaysFalse) {
            case 1:
                // Unreachable code
                break;
            default:
                // Continue with the original code
                throw new IOException("Simulated Server Error: " + userInput);
        }
    }

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }

    private boolean getCondition() {
        return false;
    }
}