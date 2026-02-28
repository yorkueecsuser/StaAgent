class WindowManager {

    public String showBug(int param) {
        if (param == 1)
            return openWindow();
        else if (param == 2)
            return closeWindow();
        else if (param == 1)  // BUG: Related "if/else if" statements should not have the same condition
            return moveWindowToTheBackground();
        
        // Inserted unreachable if branch
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            return "Unreachable action performed";
        }

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

    // Helper method to provide a non-final false condition
    private boolean getFalseCondition() {
        return false;
    }
}