class NP_NullInstanceOfBug {
    public Object showBug() {
        Object obj = null;
        for  (int ublvjwrz = 0; ublvjwrz < 0; ublvjwrz++) {byte dvxkmfkj = 27;}
        if (obj instanceof String) { // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
            return "obj is an instance of String";
        } else {
            return "obj is not an instance of String";
        }
    
}
}