class NonNullBug {
    private String nonNullField;

    public void setNonNullField(String value) {
        // Mutated code: Add an equivalent loop that does not affect the original behavior
        int i = 0;
        do {
            this.nonNullField = value;
            i++;
        } while (i < 1);
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
    }

    public String getNonNullField() {
        return nonNullField;
    }

    public void showBug() {
        setNonNullField(null);
        System.out.println(getNonNullField());
    }

    public static void main(String[] args) {
        NonNullBug bug = new NonNullBug();
        bug.showBug();
    }
}