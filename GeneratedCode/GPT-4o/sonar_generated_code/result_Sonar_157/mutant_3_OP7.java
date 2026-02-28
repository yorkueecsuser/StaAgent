class WindowManager {

    public String showBug(int param) {
        if (param == 1)
            return openWindow();
        else if (param == 2)
            return closeWindow();
        else if (param == 1)  // BUG: Related "if/else if" statements should not have the same condition
            return moveWindowToTheBackground();
        
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable due to the condition
            System.out.println("This will never be printed.");
        }

        return "No action performed";
    }

    private boolean getCondition() {
        return false; // This ensures the while loop is unreachable
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