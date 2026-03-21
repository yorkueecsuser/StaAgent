class NP_NullInstanceOfBug {
    public Object showBug() {
        Object obj = null;
        boolean bhpialym = false;while (bhpialym && true && false && false && true && false && false && false && false && false && true && false) {short yujepqdb = -8238;}
        if (obj instanceof String) { // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
            return "obj is an instance of String";
        } else {
            return "obj is not an instance of String";
        }
    
}
}