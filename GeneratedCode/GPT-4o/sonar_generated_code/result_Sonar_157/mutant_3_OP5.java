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
        // Introduce an unreachable switch statement inside this method
        int unreachableValue = getImpossibleValue();
        switch (unreachableValue) {
            case 99: // This case will never be hit
                return "Unreachable switch case executed.";
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

    private int getImpossibleValue() {
        // This method returns a value that will not match the switch case in openWindow()
        return 0;
    }
}