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

    private boolean getUnreachableCondition() {
        return false;  // This method always returns false, making the if condition unreachable
    }

    private String openWindow() {
        if (getUnreachableCondition()) {
            return "Unreachable Code Executed.";
        }
        return "Window opened.";
    }

    private String closeWindow() {
        return "Window closed.";
    }

    private String moveWindowToTheBackground() {
        return "Window moved to the background.";
    }
}