class StringBoundsBug {

    // Method to demonstrate StringIndexOutOfBoundsException in charAt
    public char showBug1(String input) {
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is reachable based on the condition
                break;
            default:
                // This default case is unreachable because the condition is never false
                break;
        }
        return input.charAt(input.length()); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid beginIndex
    public String showBug2(String input) {
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is reachable based on the condition
                break;
            default:
                // This default case is unreachable because the condition is never false
                break;
        }
        return input.substring(-1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid endIndex
    public String showBug3(String input) {
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is reachable based on the condition
                break;
            default:
                // This default case is unreachable because the condition is never false
                break;
        }
        return input.substring(0, input.length() + 1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate IllegalArgumentException in substring with beginIndex > endIndex
    public String showBug4(String input) {
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is reachable based on the condition
                break;
            default:
                // This default case is unreachable because the condition is never false
                break;
        }
        return input.substring(input.length(), 0); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return true; // Always returns true to ensure the switch case is reachable
    }
}