class BuggyCode {
    private String value;
    private boolean getCondition() {
        return false; // Method to always return false for the mutation
    }

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
            if (getCondition()) { // Unreachable if-else statement
                System.out.println("This should not be printed.");
            } else {
                return value.substring(1); // Original bug still exists here
            }
        }
    }
}