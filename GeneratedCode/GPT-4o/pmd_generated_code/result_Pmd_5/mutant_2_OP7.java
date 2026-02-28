class BranchingBugExample {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }

        // Inserting unreachable while loop as per mutation operator
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This block is unreachable because conditionWhile is always false
            sum += 1; // Example code to show block
        }

        return sum;
    }

    // Helper method to provide a dynamic false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result: " + example.showBug());
    }
}