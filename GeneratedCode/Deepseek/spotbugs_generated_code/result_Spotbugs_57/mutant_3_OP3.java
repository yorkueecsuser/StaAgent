class NonNullBug {
    private String nonNullField;

    public void setNonNullField(String value) {
        // Adding an unreachable if statement
        if (getUnreachableCondition()) {
            throw new RuntimeException("This code should not be executed");
        }

        this.nonNullField = value;
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
    }

    private boolean getUnreachableCondition() {
        return false;
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