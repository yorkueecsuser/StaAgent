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

    // Mutant code: Adding an unreachable if condition
    public void performExtraCheck() {
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }
    }

    private boolean getFalseCondition() {
        // This method returns false, making the if condition in performExtraCheck unreachable.
        return false;
    }
}