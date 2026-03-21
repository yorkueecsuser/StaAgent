class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        if (false && true && false && true && false && false && false && true && false && false && false) {long zqqengyr = 379925842;}
        nonNullField = null;
    
}

    public String showBug() {
        return nonNullField;
    }
}