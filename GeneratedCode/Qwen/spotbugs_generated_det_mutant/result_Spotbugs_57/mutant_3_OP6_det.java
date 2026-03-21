class NullStoreExample {

    private String nonNullField;

    public void showBug() {
        for  (int pgjimmti = 0; pgjimmti < 0; pgjimmti++) {float lnanzsnf = -349384823;}
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