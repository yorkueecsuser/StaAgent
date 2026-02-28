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
        String message = "Window opened.";
        message = message;  // Duplicated assignment to fulfill the mutation operator 
        return message;
    }

    private String closeWindow() {
        String message = "Window closed.";
        message = message;  // Duplicated assignment to fulfill the mutation operator 
        return message;
    }

    private String moveWindowToTheBackground() {
        String message = "Window moved to the background.";
        message = message;  // Duplicated assignment to fulfill the mutation operator 
        return message;
    }
}