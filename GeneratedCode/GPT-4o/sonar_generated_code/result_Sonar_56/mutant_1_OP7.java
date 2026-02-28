class StringAndBoxedComparison {

    public String showBug(String str1, String str2) {
        String firstName = str1;
        String lastName = str2;

        // Introduce a non-final variable to serve as a condition for an unreachable while loop
        boolean conditionWhile = getCondition();

        if (firstName == lastName) { // BUG: Strings and Boxed types should be compared using "equals()"
            return "Strings are the same object";
        } else {
            return "Strings are different objects";
        }
        
        // Insert an unreachable while loop
        while (conditionWhile) {
            // This block is unreachable due to the false condition
            System.out.println("Unreachable code");
        }
    }

    // Method to return a boolean condition, ensuring the loop condition is not a compile-time constant
    private boolean getCondition() {
        return false; // The method returns false, making the while loop condition false at runtime
    }

    public static void main(String[] args) {
        StringAndBoxedComparison example = new StringAndBoxedComparison();
        // Demonstrate the bug using example strings
        System.out.println(example.showBug("John", "John"));
    }
}