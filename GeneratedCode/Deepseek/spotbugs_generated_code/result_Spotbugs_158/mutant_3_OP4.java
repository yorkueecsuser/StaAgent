import java.io.IOException;

class XssBugServlet {
    protected void doGet(String userInput) throws IOException {
        if (getUnreachableCondition()) { // Unreachable condition
            System.out.println("Unreachable code");
        } else {
            throw new IOException("Simulated Server Error: " + userInput); // Original bug remains
        }
    }

    public String showBug(String userInput) throws IOException {
        doGet(userInput);
        return "Bug demonstrated with input: " + userInput;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}