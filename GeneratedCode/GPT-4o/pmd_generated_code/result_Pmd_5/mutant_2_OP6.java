class BranchingBugExample {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }

        // Unreachable for loop insertion
        boolean conditionFor = getCondition(); // Dynamically determined at runtime
        for (int j = 0; conditionFor; j++) {
            // This block is intentionally left blank
        }

        return sum;
    }

    private boolean getCondition() {
        return false; // The condition is false, making the loop unreachable.
    }

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result: " + example.showBug());
    }
}