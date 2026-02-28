class BranchingBugExample {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }
        return sum;
    }

    // Mutant method with renamed variable
    public int showBugMutant() {
        int x = 0; // Renamed variable 'sum' to 'x'
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }
        return x; // Uses renamed variable 'x'
    }

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Original Result: " + example.showBug());
        System.out.println("Mutant Result: " + example.showBugMutant());
    }
}