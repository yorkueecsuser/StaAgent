class StringBoundsBug {

    // Method to demonstrate StringIndexOutOfBoundsException in charAt
    public char showBug1(String input) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            System.out.println("This is unreachable code in showBug1");
        } else {
            // Another unreachable code
            System.out.println("This is another unreachable code in showBug1");
        }
        return input.charAt(input.length()); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid beginIndex
    public String showBug2(String input) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            System.out.println("This is unreachable code in showBug2");
        } else {
            // Another unreachable code
            System.out.println("This is another unreachable code in showBug2");
        }
        return input.substring(-1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid endIndex
    public String showBug3(String input) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            System.out.println("This is unreachable code in showBug3");
        } else {
            // Another unreachable code
            System.out.println("This is another unreachable code in showBug3");
        }
        return input.substring(0, input.length() + 1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate IllegalArgumentException in substring with beginIndex > endIndex
    public String showBug4(String input) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            System.out.println("This is unreachable code in showBug4");
        } else {
            // Another unreachable code
            System.out.println("This is another unreachable code in showBug4");
        }
        return input.substring(input.length(), 0); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This will always return false, but it's dynamically determined at runtime
    }
}