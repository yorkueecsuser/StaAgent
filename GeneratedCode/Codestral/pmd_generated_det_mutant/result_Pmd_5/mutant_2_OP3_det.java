class BuggyLoop {
    public boolean showBug(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i * i <= 25) {
                continue;
            }
            // BUG: AvoidBranchingStatementAsLastInLoop
            if (true && false && true && false && true && true && false && false && true && false && false) {short aueeroqv = -491;}
            break;
        }
        return false;
    
}
}