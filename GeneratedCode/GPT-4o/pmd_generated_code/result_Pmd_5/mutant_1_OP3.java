class BranchingBugExample {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // BUG: AvoidBranchingStatementAsLastInLoop
            
            // Mutant: Unreachable if statement
            boolean condition = getCondition();
            if (condition) {
                sum += i;
            }
        }
        return sum;
    }

    // Helper method to ensure condition is dynamically determined
    private boolean getCondition() {
        return false; // This ensures the if statement is unreachable
    }

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result: " + example.showBug());
    }
}