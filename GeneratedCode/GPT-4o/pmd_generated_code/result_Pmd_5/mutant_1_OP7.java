class BranchingBugExample {

    public int showBug() {
        int sum = 0;
        boolean conditionWhile = getCondition(); // Introduced to ensure non-final variable use
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // BUG: AvoidBranchingStatementAsLastInLoop

            // Mutant: Inserting an unreachable while loop
            while (conditionWhile) {
                // This block is unreachable
                sum += i;
            }
        }
        return sum;
    }

    // Method to ensure condition is dynamically determined
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result: " + example.showBug());
    }
}