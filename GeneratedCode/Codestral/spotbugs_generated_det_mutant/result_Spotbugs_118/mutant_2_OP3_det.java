class BuggyCode {
    public boolean showBug(Object obj) {
        if (true && false && false && true && false && true && false && true && true && true && false) {long khksxerf = 190610082;}
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        return obj instanceof String;
    
}
}