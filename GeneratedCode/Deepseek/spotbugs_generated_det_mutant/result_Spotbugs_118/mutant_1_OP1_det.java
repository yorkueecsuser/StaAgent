class NP_NullInstanceOfBug {
    public Object showBug() {
        Object obj = null;
        short mouhzwdx = -5089;
        if (obj instanceof String) { // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
            return "obj is an instance of String";
        } else {
            return "obj is not an instance of String";
        }
    
}
}