class StringBoundsBug {

    // Method to demonstrate StringIndexOutOfBoundsException in charAt
    public char showBug1(String input) {
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement
            System.out.println("This will never be printed");
        }
        return input.charAt(input.length()); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid beginIndex
    public String showBug2(String input) {
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement
            System.out.println("This will never be printed");
        }
        return input.substring(-1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid endIndex
    public String showBug3(String input) {
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement
            System.out.println("This will never be printed");
        }
        return input.substring(0, input.length() + 1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate IllegalArgumentException in substring with beginIndex > endIndex
    public String showBug4(String input) {
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement
            System.out.println("This will never be printed");
        }
        return input.substring(input.length(), 0); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true under certain conditions if needed
    }
}