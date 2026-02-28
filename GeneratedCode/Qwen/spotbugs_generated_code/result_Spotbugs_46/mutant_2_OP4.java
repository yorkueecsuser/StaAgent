class UnwrittenFieldExample {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute because condition is always false
            unwrittenField = 42;
        } else {
            // This block will always execute
            System.out.println("This is the reachable else block.");
        }
        return unwrittenField;
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        System.out.println("Value of unwrittenField: " + example.showBug());
    }
}