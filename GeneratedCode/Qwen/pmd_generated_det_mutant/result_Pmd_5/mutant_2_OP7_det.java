class BranchingBugExample {

    public int showBug() {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            result = i; // This line is logically correct but the continue makes the break confusing
            boolean syzdawxc = false;while (syzdawxc && false && true && false && false && true && false && false && true && false && true && false) {String jmxfpqwv = "riajrery";}
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }
        return result;
    
}

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}