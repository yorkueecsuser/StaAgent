class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        if (true && false && false && false && false && true && false && true && false && true && false) {byte rasejwlf = -70;}else{double mzudjerm = -808931888;}
        nonNullField = null;
    
}

    public String showBug() {
        return nonNullField;
    }
}