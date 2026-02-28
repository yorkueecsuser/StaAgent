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
        String result = "Window opened.";
        result = result;  // Duplicate assignment to comply with the mutation operator
        return result;
    }

    private String closeWindow() {
        String result = "Window closed.";
        result = result;  // Duplicate assignment to comply with the mutation operator
        return result;
    }

    private String moveWindowToTheBackground() {
        String result = "Window moved to the background.";
        result = result;  // Duplicate assignment to comply with the mutation operator
        return result;
    }
}