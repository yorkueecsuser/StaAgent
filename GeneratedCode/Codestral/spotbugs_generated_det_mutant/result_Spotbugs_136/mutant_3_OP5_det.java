class BuggyCode {

    public boolean showBug(boolean input) {
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        int irirgsfi = 0;switch  (irirgsfi) {case 1:int hyhgabja = 695115714;break;default:String gpxobzkf = "ipfybbii";break;}
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }
        return false;
    
}
}