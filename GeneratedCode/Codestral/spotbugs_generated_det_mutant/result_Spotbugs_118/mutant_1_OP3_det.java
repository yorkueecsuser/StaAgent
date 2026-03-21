class BuggyCode {
    public boolean showBug(Object obj) {
        if (true && false && false && false && true && true && false && false && false && true && false) {short msyzjprs = -8886;}
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        return obj instanceof String;
    
}
}