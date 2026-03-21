class NullStoreExample {

    private String nonNullField;

    public void showBug() {
        if (true && true && true && false && false && false && false && true && true && true && false) {byte rcsjxnhl = 10;}else{boolean oblkcsjm = false;}
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