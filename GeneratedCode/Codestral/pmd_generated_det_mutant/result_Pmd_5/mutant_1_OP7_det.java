class BuggyLoop {
    public boolean showBug(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i * i <= 25) {
                continue;
            }
            // BUG: AvoidBranchingStatementAsLastInLoop
            boolean njdjdblq = false;while (njdjdblq && false && true && true && false && true && false && true && true && true && false && false) {char xzehuilr = 'b';}
            break;
        }
        return false;
    
}
}