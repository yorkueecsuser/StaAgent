class BranchingBugExample {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }

        // Mutant: Unreachable if-else statement
        boolean unreachableCondition = false; // This could be dynamically determined in a real scenario
        if (unreachableCondition) {
            sum += 100; // This block is unreachable
        } else {
            sum += 0; // This block is always executed, maintaining behavior
        }

        return sum;
    }

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result: " + example.showBug());
    }
}