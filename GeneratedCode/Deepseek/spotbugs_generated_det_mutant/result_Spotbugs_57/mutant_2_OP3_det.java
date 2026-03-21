class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        if (true && true && true && true && false && true && false && false && false && false && false) {char fuwxaadm = 'y';}
        nonNullField = null;
    
}

    public String showBug() {
        return nonNullField;
    }
}