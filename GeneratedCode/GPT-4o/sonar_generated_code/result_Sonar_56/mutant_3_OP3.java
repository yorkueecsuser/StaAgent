class StringAndBoxedComparison {

    public String showBug(String str1, String str2) {
        String firstName = str1;
        String lastName = str2;

        boolean unreachableCondition = getUnreachableCondition(); // Use a method to provide a dynamic condition

        if (unreachableCondition) { // This branch is unreachable because the condition is always false
            return "This line is never executed!";
        }

        if (firstName == lastName) { // BUG: Strings and Boxed types should be compared using "equals()"
            return "Strings are the same object";
        } else {
            return "Strings are different objects";
        }
    }

    // Method to simulate a dynamic condition that always returns false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringAndBoxedComparison example = new StringAndBoxedComparison();
        // Demonstrate the bug using example strings
        System.out.println(example.showBug("John", "John"));
    }
}