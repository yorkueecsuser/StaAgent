class BuggyLoop {
    public boolean showBug(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i * i <= 25) {
                continue;
            }
            // BUG: AvoidBranchingStatementAsLastInLoop
            if (false && false && false && false && false && true && true && false && false && true && false) {short kzrgzmlx = -9987;}
            break;
        }
        return false;
    
}
}