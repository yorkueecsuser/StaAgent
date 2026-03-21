class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        for  (int dwhsujzt = 0; dwhsujzt < 0; dwhsujzt++) {char kyzdbycb = 'f';}
        nonNullField = null;
    
}

    public String showBug() {
        return nonNullField;
    }
}