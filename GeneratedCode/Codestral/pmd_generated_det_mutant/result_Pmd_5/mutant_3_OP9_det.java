class BuggyLoop {
    public boolean showBug(int limit) {
        { int i = 0; do { if (i * i <= 25) {
                continue;
            }
            // BUG: AvoidBranchingStatementAsLastInLoop
            break; i++; } while (i < limit); }
        return false;
    }
}