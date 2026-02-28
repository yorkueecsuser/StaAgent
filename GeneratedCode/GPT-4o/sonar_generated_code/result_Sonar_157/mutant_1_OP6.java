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
        // Unreachable for loop mutation
        boolean conditionForOpen = getCondition();
        for (int i = 0; conditionForOpen; i++) {
            // This block is unreachable
            System.out.println("Unreachable for loop in openWindow");
        }
        return "Window opened.";
    }

    private String closeWindow() {
        return "Window closed.";
    }

    private String moveWindowToTheBackground() {
        // Unreachable for loop mutation
        boolean conditionForMove = getCondition();
        for (int i = 0; conditionForMove; i++) {
            // This block is unreachable
            System.out.println("Unreachable for loop in moveWindowToTheBackground");
        }
        return "Window moved to the background.";
    }
    
    // Helper method to ensure unreachable loops
    private boolean getCondition() {
        return false;
    }
}