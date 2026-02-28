class NonNullBug {
    private String nonNullField;
    private boolean isFalse() {
        return false;
    }

    public void setNonNullField(String value) {
        for (int i = 0; isFalse(); i++) {
            // Unreachable for loop
        }
        this.nonNullField = value;
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