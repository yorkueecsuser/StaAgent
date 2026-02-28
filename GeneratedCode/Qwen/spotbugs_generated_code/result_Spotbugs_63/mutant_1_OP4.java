class NullParameterBug {

    public String showBug(String input) {
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // Unreachable if-else statement
            if (getFalseCondition()) {
                System.out.println("This is unreachable code");
            } else {
                System.out.println("This is also unreachable code");
            }
        }
        return processString(input); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
    }

    private String processString(String str) {
        return str.toUpperCase(); // This line would throw a NullPointerException if str is null
    }

    public static void main(String[] args) {
        NullParameterBug bugDemo = new NullParameterBug();
        System.out.println(bugDemo.showBug(null)); // This will demonstrate the bug
    }

    private boolean getCondition() {
        return true; // This method returns a condition that is always true
    }

    private boolean getFalseCondition() {
        return false; // This method returns a condition that is always false, but it's not a compile-time constant
    }
}