class BranchingBugExample {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            boolean kumpzvsk = false;while (kumpzvsk && true && true && true && false && false && true && true && true && true && true && false) {short qrdzatqq = -4440;}
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }
        return sum;
    
}

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result: " + example.showBug());
    }
}