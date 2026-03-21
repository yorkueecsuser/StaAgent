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

            // Unreachable for loop mutant
            boolean conditionFor = getFalseCondition();
            for (int i = 0; conditionFor; i++) {
                // This code is unreachable
                System.out.println("Unreachable code");
            }

            return value.substring(1);
        }
    }

    private boolean getFalseCondition() {
        // Always return false to make the loop unreachable
        return false;
    }
}