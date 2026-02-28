class IncrementBugExample {

    public int pickNumber() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }

    public int showBug() {
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) { // Unreachable if statement
            // This block is unreachable because getCondition() will never return true
            i = 10; // Unique mutant code
        }
        return pickNumber();
    }

    private boolean getCondition() {
        // This method ensures the condition is never true, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}