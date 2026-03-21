class BuggyCode {
    public boolean showBug(Object obj) {
        for  (int rprdatmd = 0; rprdatmd < 0; rprdatmd++) {double djzanlfk = 853447146;}
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        return obj instanceof String;
    
}
}