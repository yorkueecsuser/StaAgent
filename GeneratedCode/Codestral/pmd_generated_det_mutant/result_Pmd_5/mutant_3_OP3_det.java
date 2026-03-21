class BuggyLoop {
    public boolean showBug(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i * i <= 25) {
                continue;
            }
            // BUG: AvoidBranchingStatementAsLastInLoop
            if (false && false && true && true && true && true && true && false && true && true && false) {long doetrwpw = 646073503;}
            break;
        }
        return false;
    
}
}