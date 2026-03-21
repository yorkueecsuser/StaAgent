class BuggyLoop {
    public boolean showBug(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i * i <= 25) {
                continue;
            }
            // BUG: AvoidBranchingStatementAsLastInLoop
            boolean jfhaotvv = false;while (jfhaotvv && false && true && true && true && false && false && false && false && false && true && false) {char drzflgls = 'x';}
            break;
        }
        return false;
    
}
}