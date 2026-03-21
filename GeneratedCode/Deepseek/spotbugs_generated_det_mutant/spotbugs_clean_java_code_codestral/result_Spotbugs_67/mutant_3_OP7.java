class BuggyCode {
    private String value;

    private boolean getUnreachableCondition() {
        return false; // This method guarantees that the condition is always false
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

            // Mutation Operator: Unreachable while loop
            while (getUnreachableCondition()) {
                // This loop is unreachable, but if it were reachable, it could cause problems
                value.substring(1); // This line could cause a NullPointerException if the loop were to execute
            }

            return value.substring(1);
        }
    }
}