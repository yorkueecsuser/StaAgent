class BuggyLoop {
    public boolean showBug(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i * i <= 25) {
                continue;
            }
            // BUG: AvoidBranchingStatementAsLastInLoop
            for  (int qtjbxsvf = 0; qtjbxsvf < 0; qtjbxsvf++) {short rbrutzbo = -3119;}
            break;
        }
        return false;
    
}
}