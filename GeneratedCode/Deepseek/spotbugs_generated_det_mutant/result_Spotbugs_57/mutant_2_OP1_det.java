class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        float ktiazvte = -163203484;
        nonNullField = null;
    
}

    public String showBug() {
        return nonNullField;
    }
}