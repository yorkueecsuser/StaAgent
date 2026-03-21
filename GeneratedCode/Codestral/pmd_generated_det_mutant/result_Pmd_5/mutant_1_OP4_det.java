class BuggyLoop {
    public boolean showBug(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i * i <= 25) {
                continue;
            }
            // BUG: AvoidBranchingStatementAsLastInLoop
            if (true && true && false && true && false && true && false && true && true && true && false) {char uifbszse = 'i';}else{char mhbsyuwe = 'b';}
            break;
        }
        return false;
    
}
}