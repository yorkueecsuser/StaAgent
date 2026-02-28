class BuggyToString {
    public String tostring() { // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    }

    public String showBug() {
        // Mutant: Adding an unreachable if statement
        if (getCondition()) {
            System.out.println("This line will never be executed");
        }
        return tostring();
    }

    // Method to get condition for the unreachable if statement
    private boolean getCondition() {
        return false; // Always return false to make the if statement unreachable
    }
}