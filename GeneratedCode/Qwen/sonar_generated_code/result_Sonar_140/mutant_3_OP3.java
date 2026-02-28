class IncrementBugExample {

    public int pickNumber() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented

        // Mutant: Inserting unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            i = i + 10; // This code is unreachable
        }
    }

    public int showBug() {
        return pickNumber();
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }

    // Method to provide a dynamic condition for the if statement
    private boolean getCondition() {
        return false; // This method always returns false, ensuring the if block is unreachable
    }
}