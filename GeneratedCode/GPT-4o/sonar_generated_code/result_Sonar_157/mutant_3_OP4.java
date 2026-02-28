class WindowManager {

    public String showBug(int param) {
        if (param == 1)
            return openWindow();
        else if (param == 2)
            return closeWindow();
        else if (param == 1)  // BUG: Related "if/else if" statements should not have the same condition
            return moveWindowToTheBackground();
        return "No action performed";
    }

    private String openWindow() {
        return "Window opened.";
    }

    private String closeWindow() {
        return "Window closed.";
    }

    private String moveWindowToTheBackground() {
        return "Window moved to the background.";
    }

    // Unreachable if-else statement mutation
    public void unreachableIfElseMutation() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This block will always execute.");
        }
    }

    private boolean getUnreachableCondition() {
        // This method could be more complex, but always returns false for this mutation
        return false;
    }
}