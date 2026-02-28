class StringAndBoxedComparison {

    public String showBug(String str1, String str2) {
        String firstName = str1;
        String lastName = str2;

        // Introduce a non-final variable to ensure the condition is not a compile-time constant
        boolean unreachableCondition = getUnreachableCondition();

        // Insert an unreachable if-else statement
        if (unreachableCondition) {
            return "This is unreachable";
        } else {
            // Original code remains unchanged here
            if (firstName == lastName) { // BUG: Strings and Boxed types should be compared using "equals()"
                return "Strings are the same object";
            } else {
                return "Strings are different objects";
            }
        }
    }

    // Method to simulate a dynamic condition, always returns false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringAndBoxedComparison example = new StringAndBoxedComparison();
        // Demonstrate the bug using example strings
        System.out.println(example.showBug("John", "John"));
    }
}