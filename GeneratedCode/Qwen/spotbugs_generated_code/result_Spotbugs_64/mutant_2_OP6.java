class NullParameterExample {

    public void printString(String str) {
        System.out.println(str.length());
    }

    public int showBug() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop will never execute because conditionFor is dynamically determined to be false
        }
        printString(null); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
        return -1; // Return value is not relevant to the bug demonstration
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullParameterExample example = new NullParameterExample();
        example.showBug();
    }
}