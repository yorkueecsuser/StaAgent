class NullStoreExample {

    private String nonNullField;

    public void showBug() {
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            // Some unreachable code
            nonNullField = "This will never be executed";
        } else {
            // Some other unreachable code
            nonNullField = "Neither will this";
        }
        nonNullField = null; // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
    }

    public String getNonNullField() {
        return nonNullField;
    }

    public static void main(String[] args) {
        NullStoreExample example = new NullStoreExample();
        example.showBug();
        System.out.println("Value of nonNullField: " + example.getNonNullField());
    }

    private boolean getCondition() {
        // This method returns a condition that is always false, making the if-else branches unreachable
        return false;
    }
}