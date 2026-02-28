class StringAndBoxedComparison {

    public String showBug(String str1, String str2) {
        String firstName = str1;
        String lastName = str2;

        // Unreachable for loop added as per mutation operator
        boolean conditionFor = getConditionForLoop(); // Using a method to determine loop condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be printed because the loop condition is always false.");
        }

        if (firstName == lastName) { // BUG: Strings and Boxed types should be compared using "equals()"
            return "Strings are the same object";
        } else {
            return "Strings are different objects";
        }
    }

    // Method to provide a non-final false condition for the unreachable loop
    private boolean getConditionForLoop() {
        return false;
    }

    public static void main(String[] args) {
        StringAndBoxedComparison example = new StringAndBoxedComparison();
        // Demonstrate the bug using example strings
        System.out.println(example.showBug("John", "John"));
    }
}