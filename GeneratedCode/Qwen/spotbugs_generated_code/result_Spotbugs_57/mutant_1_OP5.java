class NullStoreExample {

    private String nonNullField;

    public void showBug() {
        nonNullField = null; // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)

        // Unreachable switch statement mutation
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                nonNullField = "This should never be executed";
                break;
            case 1:
                // This case will always be executed
                nonNullField = "This is always executed";
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement's first case unreachable
        return false;
    }

    public String getNonNullField() {
        return nonNullField;
    }

    public static void main(String[] args) {
        NullStoreExample example = new NullStoreExample();
        example.showBug();
        System.out.println("Value of nonNullField: " + example.getNonNullField());
    }
}