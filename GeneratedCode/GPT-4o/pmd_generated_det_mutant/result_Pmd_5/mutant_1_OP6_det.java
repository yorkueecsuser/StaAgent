class BranchingBugExample {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            for  (int pgmvbijh = 0; pgmvbijh < 0; pgmvbijh++) {int cdkbkgxq = -773540703;}
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }
        return sum;
    
}

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result: " + example.showBug());
    }
}