class NonNullBug {
    private String nonNullField;

    public void setNonNullField(String value) {
        boolean conditionFor = false; // condition for the unreachable for loop
        for (int i = 0; conditionFor; i++) {
            // This for loop is unreachable because the condition is always false
            System.out.println("This line should never execute.");
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