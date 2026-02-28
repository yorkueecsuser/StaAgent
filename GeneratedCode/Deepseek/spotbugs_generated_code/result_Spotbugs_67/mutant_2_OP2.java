class BuggyCode {
    private String value;

    public void setValue(String value) {
        this.value = value;
        // Mutant code: Duplicated assignment statement
        this.value = value;
    }

    public String showBug() {
        try {
            // This line throws a NullPointerException if value is null
            return value.toString();
        } catch (NullPointerException e) {
            // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH)
            // value is guaranteed to be null here, and it is dereferenced in the next line
            return value.substring(1);
        }
    }
}