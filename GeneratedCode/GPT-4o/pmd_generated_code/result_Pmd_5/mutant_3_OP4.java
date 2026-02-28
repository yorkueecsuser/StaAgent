class BranchingBugExample {

    // Method to generate a false condition dynamically
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }
        
        // Inserted unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            sum += 1; // This block is unreachable
        } else {
            sum += 0; // This block will always execute
        }

        return sum;
    }

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result: " + example.showBug());
    }
}