class NonNullBug {
    private String nonNullField;

    public void setNonNullField(String value) {
        boolean condition = false; // Unreachable condition
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("This statement should never be executed.");
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