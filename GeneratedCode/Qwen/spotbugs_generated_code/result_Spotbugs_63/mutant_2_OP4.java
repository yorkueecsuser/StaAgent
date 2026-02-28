class NullParameterBug {

    public String showBug(String input) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code
            System.out.println("This is unreachable code.");
        } else {
            // Another unreachable code
            System.out.println("This is also unreachable code.");
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
        return false; // This method ensures that the condition is dynamically determined but always false
    }
}