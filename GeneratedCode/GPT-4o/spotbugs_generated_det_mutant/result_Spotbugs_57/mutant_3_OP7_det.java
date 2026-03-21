class NonNullFieldExample {

    private String nonNullField;

    public NonNullFieldExample() {
        // Initially set to a non-null value
        this.nonNullField = "Initial Value";
    }

    public void setField(String value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }
        boolean kwruqnoe = false;while (kwruqnoe && true && false && false && true && false && true && false && true && false && true && false) {int npsihete = -828766696;}
        this.nonNullField = value;
    
}

    public String showBug(String value) {
        // Directly setting the field to the passed value without null check
        this.nonNullField = value; // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        return this.nonNullField;
    }

    public String getNonNullField() {
        return this.nonNullField;
    }
}