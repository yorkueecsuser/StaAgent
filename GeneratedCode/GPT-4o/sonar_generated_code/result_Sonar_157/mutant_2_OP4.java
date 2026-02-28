class WindowManager {

    public String showBug(int param) {
        if (param == 1)
            return openWindow();
        else if (param == 2)
            return closeWindow();
        else if (param == 1)  // BUG: Related "if/else if" statements should not have the same condition
            return moveWindowToTheBackground();
        // Inserting unreachable if-else branch
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            return "This code is unreachable.";
        } else {
            return "No action performed";
        }
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
    
    // Method to provide a false condition at runtime
    private boolean getFalseCondition() {
        return false;
    }
}