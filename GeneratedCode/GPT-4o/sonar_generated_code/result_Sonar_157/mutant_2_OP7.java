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
        boolean conditionWhile = getCondition(); // Use a method to ensure runtime evaluation
        while (conditionWhile) {
            // Unreachable while loop as conditionWhile is always false
        }
        return "Window opened.";
    }

    private String closeWindow() {
        return "Window closed.";
    }

    private String moveWindowToTheBackground() {
        return "Window moved to the background.";
    }

    private boolean getCondition() {
        return false; // This method will be used to generate a false condition at runtime
    }
}