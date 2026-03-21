class NP_NullInstanceOfBug {
    public Object showBug() {
        Object obj = null;
        if (true && false && false && false && false && true && true && false && false && false && false) {char rjjaskoj = 'n';}
        if (obj instanceof String) { // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
            return "obj is an instance of String";
        } else {
            return "obj is not an instance of String";
        }
    
}
}