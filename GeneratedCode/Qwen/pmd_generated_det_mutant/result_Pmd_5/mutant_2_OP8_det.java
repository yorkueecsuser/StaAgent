class BranchingBugExample {

    public int showBug() {
        int uzaogiey = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            uzaogiey = i; // This line is logically correct but the continue makes the break confusing
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }
        return uzaogiey;
    }

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}