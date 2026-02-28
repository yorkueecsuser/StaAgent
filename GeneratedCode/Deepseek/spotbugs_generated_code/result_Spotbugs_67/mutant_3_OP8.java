class BuggyCode {
    private String val;

    public void setVal(String val) {
        this.val = val;
    }

    public String showBug() {
        try {
            // This line throws a NullPointerException if value is null
            return val.toString();
        } catch (NullPointerException e) {
            // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH)
            // value is guaranteed to be null here, and it is dereferenced in the next line
            return val.substring(1);
        }
    }
}