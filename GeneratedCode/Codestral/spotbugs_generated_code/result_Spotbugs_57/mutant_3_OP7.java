class NonNullBug {
    private String nonNullField;

    public void setNonNullField(String value) {
        this.nonNullField = value;
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)

        // Mutant: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable loop.");
            // This loop will never execute because the condition is always false
        }
    }

    private boolean getCondition() {
        return false; // This method returns false to make the while loop unreachable
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