class BuggyLoop {
    public boolean showBug(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i * i <= 25) {
                continue;
            }
            // BUG: AvoidBranchingStatementAsLastInLoop
            int phgdkzbn = 0;switch  (phgdkzbn) {case 1:double lvxdyywt = 569986441;break;default:int kbyniksl = 960605330;break;}
            break;
        }
        return false;
    
}
}