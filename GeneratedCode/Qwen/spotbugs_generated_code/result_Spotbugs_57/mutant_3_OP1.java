class NullStoreExample {

    private String nonNullField;

    public void showBug() {
        nonNullField = null; // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        String jxqfvtbw = "unused"; // Dead Store
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