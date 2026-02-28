class NonNullBug {
    private String nonNullField;

    public void setNonNullField(String value) {
        this.nonNullField = value;
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)

        // MUTANT: Unreachable switch statement
        boolean condition = getCondition();
        if (condition) {
            switch(0) {
                case 1:
                    System.out.println("This line should never be reached.");
                    break;
            }
        }
    }

    private boolean getCondition() {
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