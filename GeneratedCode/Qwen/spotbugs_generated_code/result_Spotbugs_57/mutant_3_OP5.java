class NullStoreExample {

    private String nonNullField;

    public void showBug() {
        nonNullField = null; // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                nonNullField = "Unreachable";
                break;
            case 1:
                // This case is always executed
                break;
        }
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
        return false;
    }
}