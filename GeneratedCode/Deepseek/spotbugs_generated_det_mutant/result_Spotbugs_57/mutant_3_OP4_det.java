class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        if (false && false && false && false && false && true && true && true && false && true && false) {byte udvduslm = 7;}else{short xrvgjhra = 9171;}
        nonNullField = null;
    
}

    public String showBug() {
        return nonNullField;
    }
}