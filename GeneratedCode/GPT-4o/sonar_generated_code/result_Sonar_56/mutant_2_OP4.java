class StringAndBoxedComparison {

    public String showBug(String str1, String str2) {
        String firstName = str1;
        String lastName = str2;

        // Original if-else block
        if (firstName == lastName) { // BUG: Strings and Boxed types should be compared using "equals()"
            return "Strings are the same object";
        } else {
            return "Strings are different objects";
        }

        // Mutant: Inserting an unreachable if-else branch
        boolean unreachableCondition = getUnreachableCondition(); // Using method call to ensure dynamic determination
        if (unreachableCondition) { 
            System.out.println("This is unreachable code.");
        } else {
            System.out.println("This is also unreachable code.");
        }
    }

    // Method to obtain a condition that is always false to ensure unreachable code
    private boolean getUnreachableCondition() {
        return false; // Non-final variable or method ensures no compile-time constant
    }

    public static void main(String[] args) {
        StringAndBoxedComparison example = new StringAndBoxedComparison();
        // Demonstrate the bug using example strings
        System.out.println(example.showBug("John", "John"));
    }
}