class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        if (true && false && true && false && false && false && true && false && false && true && false) {long pfvqqnjy = 967775343;}else{String hewzzioi = "ulseujod";}
        nonNullField = null;
    
}

    public String showBug() {
        return nonNullField;
    }
}