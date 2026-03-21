class BuggyCode {
    public boolean showBug(Object obj) {
        if (false && false && true && false && true && false && true && false && true && true && false) {byte vnffeyux = -93;}
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        return obj instanceof String;
    
}
}