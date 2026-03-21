class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        for  (int xgrglxzd = 0; xgrglxzd < 0; xgrglxzd++) {long cveahopu = 129594941;}
        nonNullField = null;
    
}

    public String showBug() {
        return nonNullField;
    }
}