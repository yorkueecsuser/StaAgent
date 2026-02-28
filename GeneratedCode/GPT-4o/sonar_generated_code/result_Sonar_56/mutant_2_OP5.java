class StringAndBoxedComparison {

    public String showBug(String str1, String str2) {
        String firstName = str1;
        String lastName = str2;

        if (firstName == lastName) { // BUG: Strings and Boxed types should be compared using "equals()"
            return "Strings are the same object";
        } else {
            return "Strings are different objects";
        }
    }

    public static void main(String[] args) {
        StringAndBoxedComparison example = new StringAndBoxedComparison();
        // Demonstrate the bug using example strings
        System.out.println(example.showBug("John", "John"));

        // Insert an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // Non-final variable or method call
        switch (unreachableValue) {
            case 1:
                System.out.println("Case 1: This should never execute.");
                break;
            case 2:
                System.out.println("Case 2: This should also never execute.");
                break;
            default:
                // No default action needed since the switch is unreachable
                break;
        }
    }

    // Method to ensure the switch statement is unreachable
    private static int getUnreachableValue() {
        return 0; // Always returns 0, making switch cases unreachable
    }
}