class BuggyCode {
    public boolean showBug(Object obj) {
        if (false && true && true && false && false && false && true && true && false && false && false) {long rrtjsksi = -842300252;}else{char xdrznbyh = 'g';}
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        return obj instanceof String;
    
}
}