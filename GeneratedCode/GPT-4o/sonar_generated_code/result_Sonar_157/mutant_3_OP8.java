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

    // Mutant Code
    public String showBugMutant(int p) {
        if (p == 1)
            return openWindowMutant();
        else if (p == 2)
            return closeWindowMutant();
        else if (p == 1)  // BUG: Related "if/else if" statements should not have the same condition
            return moveWindowToTheBackgroundMutant();
        return "No action performed";
    }

    private String openWindowMutant() {
        return "Window opened.";
    }

    private String closeWindowMutant() {
        return "Window closed.";
    }

    private String moveWindowToTheBackgroundMutant() {
        return "Window moved to the background.";
    }
}