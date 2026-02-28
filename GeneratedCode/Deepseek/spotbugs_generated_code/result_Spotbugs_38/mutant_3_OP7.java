class BuggyToString {
    public String tostring() { // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    }

    public String showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // MUTANT: Unreachable while loop
            // This code will never be executed because conditionWhile is always false
            System.out.println("This is an unreachable while loop");
        }
        return tostring();
    }

    private boolean getCondition() {
        return false; // This method ensures that the condition for the while loop is always false
    }
}