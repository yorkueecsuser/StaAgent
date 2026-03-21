class BuggyLoop {
    public boolean showBug(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i * i <= 25) {
                continue;
            }
            // BUG: AvoidBranchingStatementAsLastInLoop
            int vhzmdcub = 0;switch  (vhzmdcub) {case 1:String oqpuhpuv = "zbmrnswx";break;default:byte cbogtffd = -94;break;}
            break;
        }
        return false;
    
}
}