class BuggyLoop {
    public boolean showBug(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i * i <= 25) {
                continue;
            }
            // BUG: AvoidBranchingStatementAsLastInLoop
            for  (int sztzewfh = 0; sztzewfh < 0; sztzewfh++) {float xoaimnvr = -813074725;}
            break;
        }
        return false;
    
}
}