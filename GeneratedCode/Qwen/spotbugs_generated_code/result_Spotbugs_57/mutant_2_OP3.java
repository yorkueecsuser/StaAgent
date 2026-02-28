class NullStoreExample {

    private String nonNullField;

    public void showBug() {
        boolean condition = getCondition(); // Ensuring the if statement is not compile-time constant
        if (condition) {
            // This block is unreachable because getCondition() will always return false
            nonNullField = "This is unreachable";
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
        return false; // This method ensures the condition is dynamically determined at runtime but always returns false
    }
}