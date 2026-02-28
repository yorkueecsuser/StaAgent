class StringAndBoxedComparison {

    public String showBug(String str1, String str2) {
        String firstName = str1;
        String lastName = str2;

        // Original comparison using '==', which is a bug for Strings
        if (firstName == lastName) { // BUG: Strings and Boxed types should be compared using "equals()"
            return "Strings are the same object";
        } else {
            return "Strings are different objects";
        }

        // Inserted unreachable switch statement
        int unreachableCondition = getUnreachableCondition(); // Ensures condition is dynamically evaluated
        switch (unreachableCondition) {
            case 1:
                System.out.println("This case is unreachable");
                break;
            default:
                System.out.println("Default unreachable case");
                break;
        }
    }

    // Method to provide a condition for the unreachable switch statement
    private int getUnreachableCondition() {
        return 0; // Always returns 0, making the cases unreachable
    }

    public static void main(String[] args) {
        StringAndBoxedComparison example = new StringAndBoxedComparison();
        // Demonstrate the bug using example strings
        System.out.println(example.showBug("John", "John"));
    }
}