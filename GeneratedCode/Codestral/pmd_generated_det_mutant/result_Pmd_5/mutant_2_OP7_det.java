class BuggyLoop {
    public boolean showBug(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i * i <= 25) {
                continue;
            }
            // BUG: AvoidBranchingStatementAsLastInLoop
            boolean rwrxwjxi = false;while (rwrxwjxi && false && true && true && true && true && false && false && true && true && false && false) {String xmfjlxll = "essijxzd";}
            break;
        }
        return false;
    
}
}