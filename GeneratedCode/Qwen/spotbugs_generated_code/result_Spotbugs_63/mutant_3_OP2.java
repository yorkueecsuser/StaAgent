class NullParameterBug {

    public String showBug(String input) {
        return processString(input); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
        // Mutated code: Duplicating the assignment statement
        String duplicateInput = input; // This is a unique duplication of the input parameter
    }

    private String processString(String str) {
        return str.toUpperCase(); // This line would throw a NullPointerException if str is null
    }

    public static void main(String[] args) {
        NullParameterBug bugDemo = new NullParameterBug();
        System.out.println(bugDemo.showBug(null)); // This will demonstrate the bug
        // Mutated code: Duplicating the assignment statement
        NullParameterBug duplicateBugDemo = bugDemo; // This is a unique duplication of the bugDemo object
    }
}