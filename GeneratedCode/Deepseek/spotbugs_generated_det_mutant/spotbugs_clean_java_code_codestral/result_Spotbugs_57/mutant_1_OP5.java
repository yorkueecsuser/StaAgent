class NonNullBug {
    private String nonNullField;

    public void setNonNullField(String value) {
        this.nonNullField = value;
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)

        // MUTANT CODE: Unreachable switch statement
        boolean shouldRun = false;
        if (shouldRun) {
            int value = getValue();
            switch (value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    private int getValue() {
        return 0; // This ensures the switch statement is unreachable
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