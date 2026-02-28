class StringBoundsBug {

    // Method to demonstrate StringIndexOutOfBoundsException in charAt
    public char showBug1(String input) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some placeholder code that does not affect the logic
            System.out.println("This is a placeholder for demonstration.");
        } else {
            // This else block is unreachable because shouldRun is always true in this context
            System.out.println("This is an unreachable else block.");
        }
        return input.charAt(input.length()); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid beginIndex
    public String showBug2(String input) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some placeholder code that does not affect the logic
            System.out.println("This is a placeholder for demonstration.");
        } else {
            // This else block is unreachable because shouldRun is always true in this context
            System.out.println("This is an unreachable else block.");
        }
        return input.substring(-1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid endIndex
    public String showBug3(String input) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some placeholder code that does not affect the logic
            System.out.println("This is a placeholder for demonstration.");
        } else {
            // This else block is unreachable because shouldRun is always true in this context
            System.out.println("This is an unreachable else block.");
        }
        return input.substring(0, input.length() + 1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate IllegalArgumentException in substring with beginIndex > endIndex
    public String showBug4(String input) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some placeholder code that does not affect the logic
            System.out.println("This is a placeholder for demonstration.");
        } else {
            // This else block is unreachable because shouldRun is always true in this context
            System.out.println("This is an unreachable else block.");
        }
        return input.substring(input.length(), 0); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return true; // Always returns true to ensure the if block is executed and else is unreachable
    }
}