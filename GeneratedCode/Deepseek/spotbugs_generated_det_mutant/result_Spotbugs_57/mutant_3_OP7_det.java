class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        boolean puzzjjpx = false;while (puzzjjpx && false && true && true && true && false && false && true && false && false && false && false) {float nszcoyti = -209891414;}
        nonNullField = null;
    
}

    public String showBug() {
        return nonNullField;
    }
}