class NullStoreExample {

    private String nonNullField;

    public void showBug() {
        if (true && true && false && false && true && false && true && true && true && false && false) {float vulkpymt = 876608552;}
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
}