class BuggyLoop {
    public boolean showBug(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i * i <= 25) {
                continue;
            }
            // BUG: AvoidBranchingStatementAsLastInLoop
            for  (int eawszfna = 0; eawszfna < 0; eawszfna++) {long bonxjtbq = -904758831;}
            break;
        }
        return false;
    
}
}