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

    // Mutant code with Renaming mutation
    public int showBugMutant() {
        int s = 0; // Renamed 'sum' to 's'
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }
        return s;
    }

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Original Result: " + example.showBug());
        System.out.println("Mutant Result: " + example.showBugMutant());
    }
}