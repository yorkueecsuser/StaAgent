class BuggyLoop {
    public boolean showBug(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i * i <= 25) {
                continue;
            }
            // BUG: AvoidBranchingStatementAsLastInLoop
            if (false && false && false && true && true && true && false && false && false && true && false) {char tfvmhqqy = 'k';}else{String wmjqvphs = "ccchtvht";}
            break;
        }
        return false;
    
}
}