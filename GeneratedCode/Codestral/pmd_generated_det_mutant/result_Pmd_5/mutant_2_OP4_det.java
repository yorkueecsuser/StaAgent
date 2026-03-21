class BuggyLoop {
    public boolean showBug(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i * i <= 25) {
                continue;
            }
            // BUG: AvoidBranchingStatementAsLastInLoop
            if (false && true && true && false && true && false && false && false && true && false && false) {int reybsopf = 188378560;}else{int aaiuihqd = 117386454;}
            break;
        }
        return false;
    
}
}