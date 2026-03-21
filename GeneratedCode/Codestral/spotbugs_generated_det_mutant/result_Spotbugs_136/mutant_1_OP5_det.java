class BuggyCode {

    public boolean showBug(boolean input) {
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        int zaovwyue = 0;switch  (zaovwyue) {case 1:float tazyucxf = -176602556;break;default:float ayqjlhld = 563298004;break;}
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }
        return false;
    
}
}