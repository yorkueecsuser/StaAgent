class StringComparison {
    public boolean checkString(String s) {
        if (s == "one") {
            boolean unreachableCondition = getUnreachableCondition(); // Added method call
            while (unreachableCondition) { // Unreachable while loop
                // This code will never be executed
            }
            return true;
        }
        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }

    // Dummy method to return false, making the while loop unreachable
    private boolean getUnreachableCondition() {
        return false;
    }
}