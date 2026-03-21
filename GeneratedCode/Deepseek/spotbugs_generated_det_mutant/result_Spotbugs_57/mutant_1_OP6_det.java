class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        for  (int qkulithm = 0; qkulithm < 0; qkulithm++) {byte qtvvdkkj = 61;}
        nonNullField = null;
    
}

    public String showBug() {
        return nonNullField;
    }
}