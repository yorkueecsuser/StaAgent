class StringAndBoxedComparison {

    public String showBug(String str1, String str2) {
        String firstName = str1;
        String lastName = str2;

        boolean unreachableCondition = getCondition(); // A non-final variable to ensure it's not a compile-time constant
        if (unreachableCondition) { // Unreachable if statement inserted
            return "This is an unreachable branch";
        }

        if (firstName == lastName) { // BUG: Strings and Boxed types should be compared using "equals()"
            return "Strings are the same object";
        } else {
            return "Strings are different objects";
        }
    }

    // Method to ensure the condition is always false at runtime, making the branch unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringAndBoxedComparison example = new StringAndBoxedComparison();
        // Demonstrate the bug using example strings
        System.out.println(example.showBug("John", "John"));
    }
}