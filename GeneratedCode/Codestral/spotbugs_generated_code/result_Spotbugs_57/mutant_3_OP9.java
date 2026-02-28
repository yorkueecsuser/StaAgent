class NonNullBug {
    private String nonNullField;

    public void setNonNullField(String value) {
        this.nonNullField = value;
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
    }

    public String getNonNullField() {
        return nonNullField;
    }

    public void showBug() {
        setNonNullField(null);
        System.out.println(getNonNullField());
    }

    public void doWhileLoopExample() {
        int i = 0;
        do {
            i++;
        } while (i < 5);
    }

    public static void main(String[] args) {
        NonNullBug bug = new NonNullBug();
        bug.showBug();
        bug.doWhileLoopExample();
    }
}