class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        long ozgmwhfu = -61390452;
        nonNullField = null;
    
}

    public String showBug() {
        return nonNullField;
    }
}