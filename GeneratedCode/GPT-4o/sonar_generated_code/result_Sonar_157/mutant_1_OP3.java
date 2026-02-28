class WindowManager {

    public String showBug(int param) {
        if (param == 1)
            return openWindow();
        else if (param == 2)
            return closeWindow();
        else if (param == 1)  // BUG: Related "if/else if" statements should not have the same condition
            return moveWindowToTheBackground();

        // Mutant: Unreachable if statement
        boolean alwaysFalse = isConditionTrue(); // A method call to ensure runtime determination
        if (alwaysFalse) {
            return "Unreachable code executed.";
        }

        return "No action performed";
    }

    private boolean isConditionTrue() {
        return false; // This makes the if-condition false at runtime
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
}