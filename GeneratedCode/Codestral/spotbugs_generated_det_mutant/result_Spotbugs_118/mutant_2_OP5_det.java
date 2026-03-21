class BuggyCode {
    public boolean showBug(Object obj) {
        int ogtihdwr = 0;switch  (ogtihdwr) {case 1:short dredfkem = 2021;break;default:String ekwxphfa = "qndoikig";break;}
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        return obj instanceof String;
    
}
}