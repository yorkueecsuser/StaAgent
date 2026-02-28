class BranchingBugExample {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }

        // Unreachable if-else statement mutation
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            sum += 100; // This block is unreachable
        } else {
            sum += 200; // This block is also unreachable
        }

        return sum;
    }

    // Method to ensure the condition is not a compile-time constant
    private boolean getUnreachableCondition() {
        return false; // Condition is always false, but determined at runtime
    }

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result: " + example.showBug());
    }
}