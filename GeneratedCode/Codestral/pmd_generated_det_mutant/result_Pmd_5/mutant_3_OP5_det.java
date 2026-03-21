class BuggyLoop {
    public boolean showBug(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i * i <= 25) {
                continue;
            }
            // BUG: AvoidBranchingStatementAsLastInLoop
            int mddpfpar = 0;switch  (mddpfpar) {case 1:byte ewbcmkih = -17;break;default:float ruveoxbo = 821779947;break;}
            break;
        }
        return false;
    
}
}