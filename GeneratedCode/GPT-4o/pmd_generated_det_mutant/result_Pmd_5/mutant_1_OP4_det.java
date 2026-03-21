class BranchingBugExample {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            if (false && true && false && true && false && true && false && false && false && true && false) {short udcisuww = -4341;}else{char gxpvlwnq = 'j';}
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }
        return sum;
    
}

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result: " + example.showBug());
    }
}