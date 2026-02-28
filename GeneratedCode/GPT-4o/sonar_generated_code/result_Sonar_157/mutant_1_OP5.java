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
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                return "This case will never be executed.";
            default:
                break;
        }
        return "Window opened.";
    }

    private String closeWindow() {
        return "Window closed.";
    }

    private String moveWindowToTheBackground() {
        return "Window moved to the background.";
    }

    private int getUnreachableValue() {
        // Ensures that the returned value is never equal to 1
        return 0;
    }
}