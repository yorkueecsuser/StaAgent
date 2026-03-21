class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        boolean mbaaremp = false;while (mbaaremp && false && false && false && false && true && false && true && false && false && false && false) {long akfxssmh = -980551411;}
        nonNullField = null;
    
}

    public String showBug() {
        return nonNullField;
    }
}