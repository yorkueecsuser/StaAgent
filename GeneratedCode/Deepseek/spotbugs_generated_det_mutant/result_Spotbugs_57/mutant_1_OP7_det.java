class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        boolean xlnhebbw = false;while (xlnhebbw && true && true && true && false && true && true && true && false && false && false && false) {short zvamyodb = 578;}
        nonNullField = null;
    
}

    public String showBug() {
        return nonNullField;
    }
}