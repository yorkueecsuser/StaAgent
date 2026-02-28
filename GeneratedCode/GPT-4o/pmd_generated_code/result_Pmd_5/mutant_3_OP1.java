class BranchingBugExample {

    public int showBug() {
        int sum = 0;
        int xjzvnqwe = 42; // Dead store: this variable is declared but never used
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }
        return sum;
    }

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result: " + example.showBug());
    }
}