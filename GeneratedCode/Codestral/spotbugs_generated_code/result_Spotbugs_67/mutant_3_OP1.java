class BuggyCode {
    private String value;
    private Integer deadStore;    // Dead Store mutation: Unused variable declaration

    public void setValue(String value) {
        this.value = value;
    }

    public String showBug() {
        try {
            // This line throws a NullPointerException if value is null
            return value.toString();
        } catch (NullPointerException e) {
            // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH)
            // value is guaranteed to be null here, and it is dereferenced in the next line
            deadStore = 10;   // Dead Store mutation: Unused variable assignment
            return value.substring(1);
        }
    }
}