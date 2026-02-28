class WindowManager {

    public String showBug(int param) {
        if (param == 1)
            return openWindow();
        else if (param == 2)
            return closeWindow();
        else if (param == 1)  // BUG: Related "if/else if" statements should not have the same condition
            return moveWindowToTheBackground();
        
        // Adding a switch statement with an unreachable condition
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                return "Unreachable Case 1";
            case 2:
                return "Unreachable Case 2";
            default:
                // No action needed, this block is unreachable
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
    
    // This method ensures the switch statement remains unreachable
    private int getUnreachableValue() {
        return 0; // Always returns a value that has no matching case
    }
}