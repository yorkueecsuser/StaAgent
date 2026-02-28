class BranchingBugExample {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition(); // Ensures the condition is not a compile-time constant
        for (int j = 0; conditionFor; j++) {
            // This block will never execute due to condition always being false
            sum += j;
        }

        return sum;
    }

    private boolean getCondition() {
        return false; // Dynamically determined at runtime to be always false
    }

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result: " + example.showBug());
    }
}