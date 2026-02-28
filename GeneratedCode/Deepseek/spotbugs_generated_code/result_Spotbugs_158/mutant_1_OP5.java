import java.io.IOException;

class XssBugServlet {
    private boolean getUnreachableCondition() {
        return false;
    }

    protected void doGet(String userInput) throws IOException {
        throw new IOException("Simulated Server Error: " + userInput);
    }

    public String showBug(String userInput) throws IOException {
        doGet(userInput);

        boolean unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case true:
                System.out.println("This line will never be executed.");
                break;
            default:
                break;
        }

        return "Bug demonstrated with input: " + userInput;
    }
}