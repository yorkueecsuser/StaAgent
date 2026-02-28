class BuggyCode {
    private String value;

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

            // Start of the unreachable for loop
            boolean conditionFor = false;
            for (int i = 0; conditionFor; i++) {
                // This code is unreachable
                System.out.println("Unreachable code");
            }
            // End of the unreachable for loop

            return value.substring(1);
        }
    }

    private boolean getCondition() {
        // This is a placeholder method for dynamic condition
        return false;
    }
}