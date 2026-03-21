class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        if (true && true && false && true && true && true && true && false && false && false && false) {byte yajdqbst = 40;}
        nonNullField = null;
    
}

    public String showBug() {
        return nonNullField;
    }
}