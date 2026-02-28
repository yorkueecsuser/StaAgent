class NullStoreExample {

    private String nonNullField;

    public void showBug() {
        nonNullField = null; // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)

        // Mutated code: Adding an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            nonNullField = "Reachable";
        } else {
            nonNullField = "Unreachable";
        }
    }

    private boolean getCondition() {
        return true; // This ensures the if branch is reachable and the else branch is unreachable
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